package com.tiandisifang.mapper;

import com.tiandisifang.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper {
    List<Article> getArticle();
    Integer updateArticleContent(Object obj);
}
