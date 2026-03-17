package com.example._p_articles.formprint.infrastructure.adapter.persistence;

import com.example._p_articles.formprint.domain.model.FilterFormPrint;
import com.example._p_articles.formprint.domain.model.FormPrintModel;
import com.example._p_articles.formprint.domain.port.FormPrintPersistencePort;
import com.example._p_articles.formprint.infrastructure.adapter.persistence.mapper.FormPrintMapper;
import com.example._p_articles.formprint.infrastructure.adapter.persistence.repository.FormPrintRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FormPrintJpaAdapter implements FormPrintPersistencePort {

    private final FormPrintRepository formPrintRepository;
    private final FormPrintMapper formPrintMapper;

    @Override
    public List<FormPrintModel> getPrintArticle(FilterFormPrint filterFormPrint) {
        var specification = ForPrintJpaSpecification.withPrintArticle(filterFormPrint);
        return formPrintRepository.findAll(specification).stream().map(formPrintMapper::toFormPrintModel).toList();
    }
}
