package com.example.spinwheel.base.dto;

import lombok.Data;

@Data
public class ResultDto{

    private Integer total;

    private Integer result;

    private String className;

    private Integer classId;

    private Float rate;

    private Float winRate;
}
