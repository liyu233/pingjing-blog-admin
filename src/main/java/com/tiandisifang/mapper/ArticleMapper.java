package com.tiandisifang.mapper;

import com.tiandisifang.model.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    List<Article> getArticle();
}
