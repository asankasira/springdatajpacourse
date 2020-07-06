package org.datapersist.movies.service;

import org.datapersist.movies.model.FilmCategory;

import java.util.List;

public interface MovieService {
    List<FilmCategory> getFilmCategories(long filmId);
}
