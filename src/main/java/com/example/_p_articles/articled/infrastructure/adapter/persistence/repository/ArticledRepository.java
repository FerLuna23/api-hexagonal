package com.example._p_articles.articled.infrastructure.adapter.persistence.repository;

import com.example._p_articles.articled.infrastructure.adapter.persistence.entity.ArticledEntity;
import com.example._p_articles.articled.infrastructure.adapter.persistence.entity.ArticledIdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ArticledRepository extends JpaRepository<ArticledEntity, ArticledIdEntity>, JpaSpecificationExecutor<ArticledEntity> {
}
