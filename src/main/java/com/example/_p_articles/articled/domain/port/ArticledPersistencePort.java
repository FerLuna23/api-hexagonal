package com.example._p_articles.articled.domain.port;

import com.example._p_articles.articled.domain.model.ArticledModel;
import com.example._p_articles.articled.domain.model.FilterArticledModel;

import java.util.List;

public interface ArticledPersistencePort {
    List<ArticledModel> findAllArticleColors(FilterArticledModel filterArticledModel);
}
