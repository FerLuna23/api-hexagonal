package com.example._p_articles.article.infrastructure.adapter.persistence;

import com.example._p_articles.article.domain.model.ArticleModel;
import com.example._p_articles.article.domain.model.FilterArticle;
import com.example._p_articles.article.domain.port.ArticlePersistencePort;
import com.example._p_articles.article.infrastructure.adapter.persistence.mapper.ArticleMapper;
import com.example._p_articles.article.infrastructure.adapter.persistence.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ArticleJpaAdapter implements ArticlePersistencePort {

    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;

    @Override
    public List<ArticleModel> findAllArticle(FilterArticle filterArticle) {
        var specification = ArticleJpaSpecification.withArticle(filterArticle);
        return articleRepository.findAll(specification).stream().map(articleMapper::toArticleModel).toList();
    }

    @Override
    public ArticleModel findRelationArticle(FilterArticle filterRelationArticle) {
        var specification = ArticleJpaSpecification.withArticle(filterRelationArticle);
        return articleRepository.findOne(specification).map(articleMapper::toArticleModel).orElse(null);
    }


}
