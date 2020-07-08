package org.datapersist.movies.repository;

import org.datapersist.movies.model.FilmActor;
import org.datapersist.movies.model.key.FilmActorKey;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmActorRepository extends CrudRepository<FilmActor, FilmActorKey> {
    List<FilmActor> findFilmActorsByActor_Id(long actorId);
    List<FilmActor> findByFilm_FilmIDAndActor_LastNameIsStartingWith(long filmId, String lastInitial);
}
