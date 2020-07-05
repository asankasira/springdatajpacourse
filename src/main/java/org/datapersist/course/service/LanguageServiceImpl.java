package org.datapersist.course.service;

import org.datapersist.course.model.Language;
import org.datapersist.course.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    private LanguageRepository repository;

    @Override
    public List<Language> findAllLanguages() {
        List<Language> languages = new ArrayList<>();
        repository.findAll().forEach(languages::add);
        return languages;
    }

    @Override
    public Language findLanguage(Long langID) {
        return repository.findById(langID).get();
    }

    @Override
    public void addLanguage(Language l) {
        repository.save(l);
    }

    @Override
    public void updateLanguage(Language l) {
        repository.save(l);
    }

    @Override
    public void deleteLanguage(Long id) {
        repository.deleteById(id);
    }

    @Autowired
    public void setRepository(LanguageRepository repository) {
        this.repository = repository;
    }
}
