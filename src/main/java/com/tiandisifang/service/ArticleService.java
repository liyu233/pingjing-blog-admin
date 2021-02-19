package com.tiandisifang.service;

import com.tiandisifang.mapper.ArticleMapper;
import com.tiandisifang.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    public List<Article> getArticle() {
        return articleMapper.getArticle();
    };
}
