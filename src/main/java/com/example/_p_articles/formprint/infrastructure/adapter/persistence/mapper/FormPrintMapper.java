package com.example._p_articles.formprint.infrastructure.adapter.persistence.mapper;

import com.example._p_articles.formprint.domain.model.FormPrintModel;
import com.example._p_articles.formprint.infrastructure.adapter.persistence.entity.FormPrintEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FormPrintMapper {
    FormPrintModel toFormPrintModel(FormPrintEntity formPrintEntity);
}
