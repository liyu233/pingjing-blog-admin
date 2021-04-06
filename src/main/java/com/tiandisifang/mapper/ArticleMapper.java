package com.tiandisifang.mapper;

import com.tiandisifang.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper {
    List<Article> getArticle();
    @Update("update article set article_content_html = #{obj.articleContentHtml} where id = #{obj.id}")
    Integer updateArticleContent(@Param("obj") Object obj);
}
