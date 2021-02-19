package com.tiandisifang.model;
import lombok.Data;

@Data
public class Article {
    private Integer id;
    private StringBuilder articleContentHtml;
    private String articleCreateTime;
    private String articleState;
}
