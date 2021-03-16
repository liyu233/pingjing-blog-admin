package com.tiandisifang.controller;

import com.tiandisifang.model.Article;
import com.tiandisifang.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @ResponseBody
    @PostMapping("list")
    public List<Article> getList(Integer article_type){
        return articleService.getArticle();
    }
    @ResponseBody
    @PostMapping("updateArticle")
    public Integer updateArticle(@RequestBody Object obj){
        return articleService.updateArticle(obj);
    }
}
