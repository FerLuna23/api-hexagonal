package com.example._p_articles.articled.infrastructure.adapter.persistence;

import com.example._p_articles.articled.domain.model.ArticledModel;
import com.example._p_articles.articled.domain.model.FilterArticledModel;
import com.example._p_articles.articled.domain.port.ArticledPersistencePort;
import com.example._p_articles.articled.infrastructure.adapter.persistence.mapper.ArticledMapper;
import com.example._p_articles.articled.infrastructure.adapter.persistence.repository.ArticledRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ArticledJpaAdapter implements ArticledPersistencePort {

    private final ArticledRepository articledRepository;
    private final ArticledMapper articledMapper;

    @Override
    public List<ArticledModel> findAllArticleColors(FilterArticledModel filterArticledModel) {
        var specification = ArticledJpaSpecification.withFilterArticled(filterArticledModel);
        return articledRepository.findAll(specification).stream().map(articledMapper::toArticledModel).toList();
    }
}
