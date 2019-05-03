package com.example.spinwheel;

import com.example.spinwheel.base.domain.TotalScoreReal;
import com.example.spinwheel.utils.LoggerManager;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class StatisticBo {
    private static LoggerManager logger = LoggerManager.getLogger(StatisticBo.class);

    public List<TotalScoreReal> checkTotalScore(List<TotalScoreReal> list) {
        List<TotalScoreReal> result = new ArrayList<>();
        for (TotalScoreReal real: list) {
            Float interval = real.getGoal() - real.getHalf_score();

            if (real.getHalf_score() > 0 && interval < real.getFirst_goal() && real.getScore() < real.getGoal()) {
                result.add(real);
            }
        }
        return result;
    }

    public List<TotalScoreReal> checkTotal(List<TotalScoreReal> list) {
        List<TotalScoreReal> result = new ArrayList<>();
        for (TotalScoreReal real: list) {
            Float interval = real.getGoal() - real.getHalf_score();

            if (real.getHalf_score() > 0 && interval < real.getFirst_goal()) {
                result.add(real);
            }
        }
        return result;
    }

    public Float sumRate(List<TotalScoreReal> list) {
        Float result = 0F;
        Integer count = 0;
        for (TotalScoreReal real: list) {
            Float interval = real.getGoal() - real.getHalf_score();
            if (real.getHalf_score() > 0 && interval < real.getFirst_goal()) {
                count++;
                Float odds = real.getScore() - real.getGoal();
                if (odds > 0.25) {
                    continue;
                }
                if (odds == 0.25) {
                    result += 0.5F;
                    continue;
                }
                if (odds == 0) {
                    result += 1F;
                    continue;
                }
                if (odds == -0.25) {
                    result += (1F + real.getDown_odds()/2);
                    continue;
                }
                if (odds < -0.25) {
                    result += (1F + real.getDown_odds());
                    continue;
                }
            }
        }
        if (count == 0) {
            return 0F;
        }
        BigDecimal b = new BigDecimal(result/count);
        return b.setScale(4, BigDecimal.ROUND_HALF_UP).floatValue();
    }
}
