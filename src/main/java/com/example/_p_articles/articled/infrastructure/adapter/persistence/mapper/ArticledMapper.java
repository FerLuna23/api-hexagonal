package com.example._p_articles.articled.infrastructure.adapter.persistence.mapper;

import com.example._p_articles.articled.domain.model.ArticledModel;
import com.example._p_articles.articled.infrastructure.adapter.persistence.entity.ArticledEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArticledMapper {
    ArticledModel toArticledModel(ArticledEntity artiledEntity);
}
