package com.example.spinwheel;

import com.example.spinwheel.base.domain.TotalScoreReal;
import com.example.spinwheel.utils.LoggerManager;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StatisticBo {
    private static LoggerManager logger = LoggerManager.getLogger(StatisticBo.class);

    public List<TotalScoreReal>  checkTotalScore(List<TotalScoreReal> list) {
        List<TotalScoreReal> result = new ArrayList<>();
        for (TotalScoreReal real: list) {
            Float interval = real.getGoal() - real.getHalf_score();

            if (real.getHalf_score() > 0 && interval < real.getFirst_goal() && real.getScore() < real.getGoal()) {
                result.add(real);
            }
        }
        return result;
    }
}
