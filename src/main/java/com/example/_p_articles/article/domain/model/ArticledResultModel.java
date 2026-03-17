package com.example._p_articles.article.domain.model;

import com.example._p_articles.articled.domain.model.ArticledModel;
import com.example._p_articles.formprint.domain.model.FormPrintModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArticledResultModel {
    private ArticleModel relatedArticle;
    private List<ArticledModel> colorsRelatedArticle;
    private List<FormPrintModel> formPrintsRelatedArticle;
}
