package com.tiandisifang.controller;

import com.tiandisifang.model.Article;
import com.tiandisifang.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @PostMapping("list")
    public List<Article> getList(Integer article_type){
        System.out.println(article_type);
        return articleService.getArticle();
    }
}
