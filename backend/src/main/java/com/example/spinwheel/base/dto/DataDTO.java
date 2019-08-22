package com.example.spinwheel.base.dto;

import lombok.Data;

@Data
public class DataDTO {
    private String touser;
    private String template_id;
    private NewsTemplateDTO data;
}
