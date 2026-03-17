package com.example._p_articles.article.infrastructure.adapter.persistence.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ArticleIdEntity  implements Serializable {
    private String idArticulo;
    private String idLinea;
    private Integer artEmpresa;
}
