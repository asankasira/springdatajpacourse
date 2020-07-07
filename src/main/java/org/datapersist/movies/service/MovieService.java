package org.datapersist.movies.service;

import org.datapersist.movies.model.FilmCategory;

import java.util.List;

public interface MovieService {
    List<FilmCategory> getFilmCategoriesFromFilmID(long filmId);

    void addFilmCategory(FilmCategory category);
}
