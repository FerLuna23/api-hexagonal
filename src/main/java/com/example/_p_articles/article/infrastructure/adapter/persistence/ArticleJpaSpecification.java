package com.example._p_articles.article.infrastructure.adapter.persistence;

import com.example._p_articles.article.domain.model.FilterArticle;
import com.example._p_articles.article.infrastructure.adapter.persistence.entity.ArticleEntity;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

public class ArticleJpaSpecification {

    public static Specification<ArticleEntity> withArticle(FilterArticle filterArticleIdOrNews) {
        return (root, query, criteriaBuilder) -> {
            Predicate predicates = criteriaBuilder.conjunction();

            if (filterArticleIdOrNews.getIdArticulo() != null && !filterArticleIdOrNews.getIdArticulo().trim().isEmpty()) {
                predicates = criteriaBuilder.equal(root.get("idArticulo"), filterArticleIdOrNews.getIdArticulo());
            }

            if(filterArticleIdOrNews.getProductoNuevo() != null && !filterArticleIdOrNews.getProductoNuevo().trim().isEmpty()) {
                predicates = criteriaBuilder.equal(root.get("productoNuevo"), filterArticleIdOrNews.getProductoNuevo());
            }

            return predicates;
        };
    }
}
