<template>
  <div class="dashboard-container">
    <el-row :gutter="20" style="margin-bottom: 0.5em">
      <el-col :span="4">
        <span>赛季</span>
      </el-col>
      <el-col :span="4">
        <span>联赛</span>
      </el-col>
    </el-row>
    <el-row :gutter="20" style="margin-bottom: 1em">
      <el-col :span="4">
        <el-select v-model="ruleForm.season" size="medium" disabled placeholder="请选择赛季">
          <el-option
            v-for="item in initParams.seasons"
            :key="item.value"
            :value="item.value"
            :label="item.label"/>
        </el-select>
      </el-col>
      <el-col :span="4">
        <el-select v-model="ruleForm.sclass" size="medium" placeholder="请选择联赛">
          <el-option
            v-for="item in initParams.sclasses"
            :key="item.value"
            :value="item.value"
            :label="item.label.trim()"/>
        </el-select>
      </el-col>
    </el-row>
    <el-row :gutter="20" style="margin-bottom: 0.5em">
      <el-col :span="4">
        <span>主队半场得分</span>
      </el-col>
      <el-col :span="4">
        <span>客队半场得分</span>
      </el-col>
      <el-col :span="4">
        <span>初盘盘口</span>
      </el-col>
      <el-col :span="4">
        <span>中场盘口</span>
      </el-col>
    </el-row>
    <el-row :gutter="20" style="margin-bottom: 1em">
      <el-col :span="4">
        <el-select v-model="ruleForm.homeScore" size="medium" placeholder="请选择主队半场得分">
          <el-option
            v-for="item in initParams.homeScores"
            :key="item"
            :value="item"
            :label="item"/>
        </el-select>
      </el-col>
      <el-col :span="4">
        <el-select v-model="ruleForm.guestScore" size="medium" placeholder="请选择客队半场得分">
          <el-option
            v-for="item in initParams.guestScores"
            :key="item"
            :value="item"
            :label="item"/>
        </el-select>
      </el-col>
      <el-col :span="4">
        <el-select v-model="ruleForm.firstGoal" size="medium" placeholder="请选择初盘盘口">
          <el-option
            v-for="item in initParams.firstGoals"
            :key="item"
            :value="item"
            :label="item"/>
        </el-select>
      </el-col>
      <el-col :span="4">
        <el-select v-model="ruleForm.midGoal" size="medium" placeholder="请选择中场盘口">
          <el-option
            v-for="item in initParams.midGoals"
            :key="item"
            :value="item"
            :label="item"/>
        </el-select>
      </el-col>
      <el-col :span="4">
        <el-button type="primary" size="medium" @click="getStatistic">查询</el-button>
      </el-col>
    </el-row>
    <el-row v-loading="loading" element-loading-text="查询中" element-loading-spinner="el-icon-loading" element-loading-background="rgba(255, 255, 255, 0.8)" style="margin-bottom: 1em">
      <el-table :data="resultForm" border @row-dblclick="getDetail">
        <el-table-column prop="className" label="联赛名称"/>
        <el-table-column prop="total" sortable label="满足条件场次"/>
        <el-table-column prop="result" sortable label="赢球场次"/>
        <el-table-column prop="winRate" sortable label="赢球率">
          <template slot-scope="scope">
            <el-progress :stroke-width="6" :percentage="scope.row.winRate*100"/>
          </template>
        </el-table-column>
        <el-table-column prop="rate" sortable label="盈利率">
          <template slot-scope="scope">
            <el-progress v-if="scope.row.rate >= 1" :stroke-width="6" :percentage="(scope.row.rate/2.08*100).toFixed(1)"/>
            <el-progress v-if="scope.row.rate < 1" :percentage="((1-scope.row.rate)*100).toFixed(1)" :stroke-width="6" color="#FF0000" />
          </template>
        </el-table-column>
      </el-table>
    </el-row>
    <el-dialog
      :visible.sync="dialogVisible"
      :before-close="handleClose"
      title="明细"
      width="80%">
      <el-table :data="detailForm" border>
        <el-table-column prop="match_season" label="赛季"/>
        <el-table-column label="联赛">
          <template slot-scope="scope">
            <p> {{ tempClassName }} </p>
          </template>
        </el-table-column>
        <el-table-column prop="home_score" sortable label="终场得分（主）"/>
        <el-table-column prop="guest_score" sortable label="终场得分（客）"/>
        <el-table-column prop="home_half_score" sortable label="中场得分（主）"/>
        <el-table-column prop="guest_half_score" sortable label="中场得分（客）"/>
        <el-table-column prop="first_goal" sortable label="初始盘口"/>
        <el-table-column prop="goal" sortable label="中场盘口"/>
        <el-table-column prop="first_up_odds" sortable label="初始上水"/>
        <el-table-column prop="first_down_odds" sortable label="初始下水"/>
        <el-table-column prop="up_odds" sortable label="中场上水"/>
        <el-table-column prop="down_odds" sortable label="中场下水"/>
        <el-table-column sortable label="结果">
          <template slot-scope="scope">
            <p v-if="scope.row.score > scope.row.goal">大</p>
            <p v-if="scope.row.score === scope.row.goal">平</p>
            <p v-if="scope.row.score < scope.row.goal">小</p>
          </template>
        </el-table-column>
      </el-table>
    </el-dialog>
  </div>
</template>

<script>
import { mapGetters } from 'vuex'
import { getDetail, getStatistic, getInitParams } from '@/api/index'

export default {
  name: 'Dashboard',
  data() {
    return {
      dialogVisible: false,
      loading: false,
      tempClassName: '1x',
      initParams: {
        seasons: [{
          value: '2018-2019',
          label: '2018-2019赛季'
        }],
        sclasses: [{
          value: -1,
          label: '全部联赛'
        }],
        homeScores: ['全部'],
        guestScores: ['全部'],
        firstGoals: ['全部'],
        midGoals: ['全部']
      },
      resultForm: [],
      detailForm: [],
      ruleForm: {
        season: '2018-2019',
        sclass: -1,
        homeScore: '全部',
        guestScore: '全部',
        firstGoal: '全部',
        midGoal: '全部'
      },
      rules: {
      }
    }
  },
  computed: {
    ...mapGetters([
      'name',
      'roles'
    ])
  },
  mounted() {
    getInitParams().then(response => {
      this.initParams.homeScores = [...this.initParams.homeScores, ...response.homeHalfScores]
      this.ruleForm.homeScore = this.initParams.homeScores[0]
      this.initParams.guestScores = [...this.initParams.guestScores, ...response.guestHalfScores]
      this.ruleForm.guestScore = this.initParams.guestScores[0]
      this.initParams.firstGoals = [...this.initParams.firstGoals, ...response.firstGoals]
      this.ruleForm.firstGoal = this.initParams.firstGoals[0]
      this.initParams.midGoals = [...this.initParams.midGoals, ...response.goals]
      this.ruleForm.midGoal = this.initParams.midGoals[0]
      this.initParams.sclasses = [...this.initParams.sclasses, ...response.seasons]
      this.ruleForm.sclasses = this.initParams.sclasses[0]
    })
  },
  methods: {
    handleDownloadFile(src) {
      location.href = './static/S5.csv'
    },
    getDetail(row, col, event) {
      this.dialogVisible = true
      var params = {}
      params.sclass = row.classId
      if (this.ruleForm.homeScore !== '全部') {
        params.homeScore = this.ruleForm.homeScore
      }
      if (this.ruleForm.guestScore !== '全部') {
        params.guestScore = this.ruleForm.guestScore
      }
      if (this.ruleForm.firstGoal !== '全部') {
        params.firstGoal = this.ruleForm.firstGoal
      }
      if (this.ruleForm.midGoal !== '全部') {
        params.goal = this.ruleForm.midGoal
      }
      this.tempClassName = row.className
      console.log(row.className)
      getDetail(params).then(response => {
        this.detailForm = response.resultList
      })
    },
    getStatistic() {
      this.loading = true
      var params = {}
      if (this.ruleForm.sclass !== -1) {
        params.sclass = this.ruleForm.sclass
      }
      if (this.ruleForm.homeScore !== '全部') {
        params.homeScore = this.ruleForm.homeScore
      }
      if (this.ruleForm.guestScore !== '全部') {
        params.guestScore = this.ruleForm.guestScore
      }
      if (this.ruleForm.firstGoal !== '全部') {
        params.firstGoal = this.ruleForm.firstGoal
      }
      if (this.ruleForm.midGoal !== '全部') {
        params.goal = this.ruleForm.midGoal
      }
      getStatistic(params).then(response => {
        this.resultForm = response.resultList
        this.loading = false
      })
    },
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          this.loading = true
          setTimeout(_ => {
            this.loading = false
            this.dialogVisible = true
          }, 3 * 1000)
        } else {
          console.log('error submit!!')
          return false
        }
      })
    },
    resetForm(formName) {
      this.$refs[formName].resetFields()
    },
    handleClose(done) {
      this.$confirm('确认关闭？')
        .then(_ => {
          done()
        })
        .catch(_ => {})
    }
  }
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
.dashboard {
  &-container {
    margin: 30px;
  }
  &-text {
    font-size: 30px;
    line-height: 46px;
  }
}
</style>
