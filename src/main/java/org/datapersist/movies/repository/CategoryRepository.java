package org.datapersist.movies.repository;

import org.datapersist.movies.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
