package org.datapersist.movies.service;

import org.datapersist.movies.model.FilmCategory;
import org.datapersist.movies.repository.FilmCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl implements MovieService {
    private FilmCategoryRepository filmCategoryRepository;

    @Autowired
    public void setFilmCategoryRepository(FilmCategoryRepository filmCategoryRepository) {
        this.filmCategoryRepository = filmCategoryRepository;
    }

    @Override
    public List<FilmCategory> getFilmCategoriesFromFilmID(long filmId) {
        return filmCategoryRepository.findFilmCategoriesByFilm_FilmID(filmId);
    }

    @Override
    public void addFilmCategory(FilmCategory category) {
        filmCategoryRepository.save(category);
    }
}
