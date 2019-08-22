package com.example.spinwheel.base.dto;

import lombok.Data;

@Data
public class NewsTemplateDTO {
    private CommonTemplateDTO first;
    private CommonTemplateDTO keyword1;
    private CommonTemplateDTO keyword2;
    private CommonTemplateDTO keyword3;
    private CommonTemplateDTO remark;

}
