package com.example._p_articles.formprint.domain.port;

import com.example._p_articles.formprint.domain.model.FilterFormPrint;
import com.example._p_articles.formprint.domain.model.FormPrintModel;

import java.util.List;

public interface FormPrintPersistencePort {
    List<FormPrintModel> getPrintArticle(FilterFormPrint filterFormPrint);
}
