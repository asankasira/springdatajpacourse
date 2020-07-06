package org.datapersist.course.repository;

import org.datapersist.course.model.Language;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LanguageRepository extends CrudRepository<Language, Long> {

    List<Language> findLanguageByNameContains(String name);
}
