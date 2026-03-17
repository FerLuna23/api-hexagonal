package com.example._p_articles.articled.infrastructure.adapter.persistence;

import com.example._p_articles.articled.domain.model.FilterArticledModel;
import com.example._p_articles.articled.infrastructure.adapter.persistence.entity.ArticledEntity;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

public class ArticledJpaSpecification {
    public static Specification<ArticledEntity> withFilterArticled(FilterArticledModel filterArticled) {
        return (root, query, criteriaBuilder) -> {
            Predicate predicates = criteriaBuilder.conjunction();

            if (filterArticled.getIdArticulo() != null && !filterArticled.getIdArticulo().trim().isEmpty()) {
                predicates = criteriaBuilder.and(
                        criteriaBuilder.equal(root.get("idArticulo"), filterArticled.getIdArticulo()),
                        criteriaBuilder.equal(root.get("webColor"), "S")
                );
            }

            return predicates;
        };
    }
}
