package com.example._p_articles.formprint.infrastructure.adapter.persistence;

import com.example._p_articles.formprint.domain.model.FilterFormPrint;
import com.example._p_articles.formprint.infrastructure.adapter.persistence.entity.FormPrintEntity;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

public class ForPrintJpaSpecification {
    public static Specification<FormPrintEntity> withPrintArticle(FilterFormPrint filterFormPrint){
        return (root, query, criteriaBuilder) -> {
            Predicate predicates = criteriaBuilder.conjunction();

            if(filterFormPrint.getIdArticulo() != null && !filterFormPrint.getIdArticulo().trim().isEmpty()){
                predicates = criteriaBuilder.equal(root.get("idArticulo"), filterFormPrint.getIdArticulo());
            }

            return predicates;
        };
    }
}
