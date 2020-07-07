package org.datapersist.movies.repository;

import org.datapersist.movies.model.FilmCategory;
import org.datapersist.movies.model.key.FilmCategoryKey;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmCategoryRepository extends CrudRepository<FilmCategory, FilmCategoryKey> {
    List<FilmCategory> findFilmCategoriesByFilm_FilmID(long filmId);
}
