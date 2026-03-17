package com.example._p_articles.article.infrastructure.adapter.persistence.repository;

import com.example._p_articles.article.infrastructure.adapter.persistence.entity.ArticleEntity;
import com.example._p_articles.article.infrastructure.adapter.persistence.entity.ArticleIdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ArticleRepository extends JpaRepository<ArticleEntity, ArticleIdEntity>, JpaSpecificationExecutor<ArticleEntity> {

}
