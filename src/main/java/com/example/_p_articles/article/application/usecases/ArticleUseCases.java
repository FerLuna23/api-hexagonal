package com.example._p_articles.article.application.usecases;

import com.example._p_articles.article.domain.model.ArticleModel;
import com.example._p_articles.article.domain.model.ArticleResultModel;
import com.example._p_articles.article.domain.model.ArticledResultModel;
import com.example._p_articles.article.domain.model.FilterArticle;
import com.example._p_articles.article.domain.port.ArticlePersistencePort;
import com.example._p_articles.articled.domain.model.ArticledModel;
import com.example._p_articles.articled.domain.model.FilterArticledModel;
import com.example._p_articles.articled.domain.port.ArticledPersistencePort;
import com.example._p_articles.formprint.domain.model.FilterFormPrint;
import com.example._p_articles.formprint.domain.model.FormPrintModel;
import com.example._p_articles.formprint.domain.port.FormPrintPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ArticleUseCases {

    private final ArticlePersistencePort articlePersistencePort;
    private final ArticledPersistencePort articledPersistencePort;
    private final FormPrintPersistencePort formPrintPersistencePort;

    public List<ArticleResultModel> findAllArticle(FilterArticle filterArticle) {

        List<ArticleResultModel> result = new ArrayList<>();

        result.addAll(findArticle(filterArticle));

        findAllArticled(filterArticle).forEach(articledResultModel -> {
            ArticleResultModel relatedArticleModel = new ArticleResultModel();
            relatedArticleModel.setRelatedArticle(articledResultModel.getRelatedArticle());
            relatedArticleModel.setColorsRelatedArticle(articledResultModel.getColorsRelatedArticle());
            relatedArticleModel.setFormPrintsRelatedArticle(articledResultModel.getFormPrintsRelatedArticle());
            result.add(relatedArticleModel);
        });

        return result;
    }


    public List<ArticleResultModel> findArticle(FilterArticle filterArticle){
        List<ArticleResultModel> listArticleResultModel = new ArrayList<>();

        articlePersistencePort.findAllArticle(filterArticle).forEach( articleModel -> {
            ArticleResultModel resultModel = new ArticleResultModel();
            resultModel.setArticle(articleModel);
            resultModel.setColors(getColorsArticle(articleModel.getIdArticulo()));
            resultModel.setFormPrints(getFormPrintArticle(articleModel.getIdArticulo()));

            listArticleResultModel.add(resultModel);
        });

        return listArticleResultModel;
    }

    public List<ArticledResultModel> findAllArticled(FilterArticle filterArticle){
        List<ArticledResultModel> listArticleResultModel = new ArrayList<>();

        articlePersistencePort.findAllArticle(filterArticle).forEach( articleModel -> {
            ArticledResultModel resultModel = new ArticledResultModel();
            if(articleModel.getIdArticuloDos() != null && !articleModel.getIdArticuloDos().isEmpty()) {
                resultModel.setRelatedArticle(getRelationArticle(articleModel.getIdArticuloDos()));
                resultModel.setColorsRelatedArticle(getColorsArticle(articleModel.getIdArticuloDos()));
                resultModel.setFormPrintsRelatedArticle(getFormPrintArticle(articleModel.getIdArticuloDos()));
            }

            listArticleResultModel.add(resultModel);
        });

        return listArticleResultModel;
    }

    public List<ArticledModel> getColorsArticle(String idArticulo) {
        FilterArticledModel filterArticledModel = new FilterArticledModel();
        filterArticledModel.setIdArticulo(idArticulo);
        return articledPersistencePort.findAllArticleColors(filterArticledModel);
    }

    public List<FormPrintModel> getFormPrintArticle(String idArticulo) {
        FilterFormPrint filterPrintArticle = new FilterFormPrint();
        filterPrintArticle.setIdArticulo(idArticulo);
        return formPrintPersistencePort.getPrintArticle(filterPrintArticle);
    }

    public ArticleModel getRelationArticle(String idArticulo) {
        FilterArticle filterRelationArticle = new FilterArticle();
        filterRelationArticle.setIdArticulo(idArticulo);
        return articlePersistencePort.findRelationArticle(filterRelationArticle);
    }

}
