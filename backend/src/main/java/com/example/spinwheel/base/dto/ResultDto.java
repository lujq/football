package com.example.spinwheel.base.dto;

import io.swagger.models.auth.In;
import lombok.Data;

@Data
public class ResultDto{

    private Integer total;

    private Integer result;

    private String className;

    private Integer classId;

    private Float rate;

}
