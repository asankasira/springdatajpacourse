package org.datapersist.course.service;

import org.datapersist.course.model.Language;

import java.util.List;

public interface LanguageService {

    List<Language> findAllLanguages();

    Language findLanguage(Long langID);

    void addLanguage(Language l);

    void updateLanguage(Language l);

    void deleteLanguage(Long id);
}
