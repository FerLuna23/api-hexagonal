package com.example._p_articles.article.infrastructure.adapter.persistence.mapper;

import com.example._p_articles.article.domain.model.ArticleModel;
import com.example._p_articles.article.infrastructure.adapter.persistence.entity.ArticleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    ArticleModel toArticleModel(ArticleEntity articleEntity);
}
