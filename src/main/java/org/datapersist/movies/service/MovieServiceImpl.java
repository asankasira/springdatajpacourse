package org.datapersist.movies.service;

import org.datapersist.movies.model.Category;
import org.datapersist.movies.model.FilmActor;
import org.datapersist.movies.model.FilmCategory;
import org.datapersist.movies.repository.CategoryRepository;
import org.datapersist.movies.repository.FilmActorRepository;
import org.datapersist.movies.repository.FilmCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl implements MovieService {
    private FilmCategoryRepository filmCategoryRepository;
    private FilmActorRepository filmActorRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    public void setFilmCategoryRepository(FilmCategoryRepository filmCategoryRepository) {
        this.filmCategoryRepository = filmCategoryRepository;
    }

    @Autowired
    public void setFilmActorRepository(FilmActorRepository filmActorRepository) {
        this.filmActorRepository = filmActorRepository;
    }

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<FilmCategory> getFilmCategoriesFromFilmID(long filmId) {
        return filmCategoryRepository.findFilmCategoriesByFilm_FilmID(filmId);
    }

    @Override
    public void addFilmCategory(FilmCategory category) {
        filmCategoryRepository.save(category);
    }

    @Override
    public List<FilmActor> getActorFilmsFromActorId(long actorId){
        return filmActorRepository.findFilmActorsByActor_Id(actorId);
    }

    @Override
    public void addFilmActor(FilmActor actor) {
        filmActorRepository.save(actor);
    }

    @Override
    public List<FilmActor> getFilmActorsFromFilmIdAndLastInitial(long filmId, String lastInitial) {
        return filmActorRepository.findByFilm_FilmIDAndActor_LastNameIsStartingWith(filmId, lastInitial);
    }

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }
}
