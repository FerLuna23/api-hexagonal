package com.example._p_articles.article.domain.model;

import lombok.Data;

@Data
public class ArticleResultFinalModel {
    private ArticleResultModel article;
    private ArticledResultModel articleRelated;
}
