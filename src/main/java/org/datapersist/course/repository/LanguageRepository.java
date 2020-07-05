package org.datapersist.course.repository;

import org.datapersist.course.model.Language;
import org.springframework.data.repository.CrudRepository;

public interface LanguageRepository extends CrudRepository<Language, Long> {
}
