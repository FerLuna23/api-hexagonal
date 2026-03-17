package com.example._p_articles.article.infrastructure.controller;

import com.example._p_articles.article.application.usecases.ArticleUseCases;
import com.example._p_articles.article.domain.model.ArticleResultModel;
import com.example._p_articles.article.domain.model.FilterArticle;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/articles")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleUseCases articleUseCases;

    @GetMapping("/findAllArticulos")
    public Optional<List<ArticleResultModel>> findAllArticle(@ModelAttribute FilterArticle filterArticle) {
        return Optional.ofNullable(articleUseCases.findAllArticle(filterArticle));
    }
}
