package com.example._p_articles.article.domain.port;

import com.example._p_articles.article.domain.model.ArticleModel;
import com.example._p_articles.article.domain.model.FilterArticle;

import java.util.List;

public interface ArticlePersistencePort {
    List<ArticleModel> findAllArticle(FilterArticle filterArticle);
    ArticleModel findRelationArticle(FilterArticle filterRelationArticle);
}
