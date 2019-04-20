<template>
  <div class="dashboard-container">
    <el-row v-loading="loading" :gutter="20" element-loading-text="生成文件中" element-loading-spinner="el-icon-loading" element-loading-background="rgba(255, 255, 255, 0.8)">
      <el-form ref="ruleForm" :model="ruleForm" :rules="rules" label-width="100px" class="demo-ruleForm">
        <el-form-item label="初始盘口" prop="firstGoal">
          <el-input-number v-model="ruleForm.firstGoal" :min="1" :max="99" controls-position="right"/>
        </el-form-item>
        <el-form-item label="初始上盘水位" prop="firstUpOdds">
          <el-input-number v-model="ruleForm.firstUpOdds" :min="1" :max="99" disabled="true" controls-position="right"/>
        </el-form-item>
        <el-form-item label="中场盘口" prop="midGoal">
          <el-input-number v-model="ruleForm.midGoal" :min="1" :max="99" controls-position="right"/>
        </el-form-item>
        <el-form-item label="中场上盘水位" prop="midUpOdds">
          <el-input-number v-model="ruleForm.midUpOdds" :min="1" :max="99" disabled="true" controls-position="right"/>
        </el-form-item>
        <el-form-item label="上半场进球数" prop="score">
          <el-input-number v-model="ruleForm.score" :min="1" :max="99" disabled="true" controls-position="right"/>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="submitForm('ruleForm')">生成文件</el-button>
          <el-button @click="resetForm('ruleForm')">重置</el-button>
        </el-form-item>
      </el-form>
    </el-row>
    <el-dialog
      :visible.sync="dialogVisible"
      :before-close="handleClose"
      title="提示"
      width="30%">
      <span>导出文件已生成，请点击确认下载</span>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="handleDownloadFile('src')">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
import { mapGetters } from 'vuex'

export default {
  name: 'Dashboard',
  data() {
    return {
      dialogVisible: false,
      loading: false,
      ruleForm: {
        firstGoal: '',
        firstUpOdds: '',
        midGoal: '',
        midUpOdds: '',
        score: ''
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
  methods: {
    handleDownloadFile(src) {
      location.href = './static/S5.csv'
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
