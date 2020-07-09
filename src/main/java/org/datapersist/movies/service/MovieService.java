package org.datapersist.movies.service;

import org.datapersist.movies.model.Category;
import org.datapersist.movies.model.FilmActor;
import org.datapersist.movies.model.FilmCategory;

import java.util.List;

public interface MovieService {
    List<FilmCategory> getFilmCategoriesFromFilmID(long filmId);

    void addFilmCategory(FilmCategory category);

    List<FilmActor> getActorFilmsFromActorId(long actorId);

    void addFilmActor(FilmActor actor);

    List<FilmActor> getFilmActorsFromFilmIdAndLastInitial(long filmId, String lastInitial);

    void addCategory(Category category);
}
