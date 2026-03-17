package com.example._p_articles.article.domain.model;

import com.example._p_articles.articled.domain.model.ArticledModel;
import com.example._p_articles.formprint.domain.model.FormPrintModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArticleResultModel {
    @JsonProperty("Articulo")
    private ArticleModel article;
    @JsonProperty("Color")
    private List<ArticledModel> colors;
    @JsonProperty("metodosImpresion")
    private List<FormPrintModel> formPrints;
    @JsonProperty("articuloRelacionado")
    private ArticleModel relatedArticle;
    @JsonProperty("colores")
    private List<ArticledModel> colorsRelatedArticle;
    @JsonProperty("metodoImpresion")
    private List<FormPrintModel> formPrintsRelatedArticle;
}
