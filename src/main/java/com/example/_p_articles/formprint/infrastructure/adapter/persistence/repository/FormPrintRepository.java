package com.example._p_articles.formprint.infrastructure.adapter.persistence.repository;

import com.example._p_articles.formprint.infrastructure.adapter.persistence.entity.FormPrintEntity;
import com.example._p_articles.formprint.infrastructure.adapter.persistence.entity.FormPrintIdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FormPrintRepository extends JpaRepository<FormPrintEntity, FormPrintIdEntity>, JpaSpecificationExecutor<FormPrintEntity> {
}
