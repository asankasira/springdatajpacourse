package org.datapersist.movies.controller;

import org.datapersist.movies.model.FilmActor;
import org.datapersist.movies.model.FilmCategory;
import org.datapersist.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    private MovieService movieService;

    @Autowired
    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping("/filmCategory/{filmId}")
    public List<FilmCategory> getFilmCategories(@PathVariable Long filmId){
        return movieService.getFilmCategoriesFromFilmID(filmId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/filmCategory")
    public void addFilmCategory(@RequestBody FilmCategory category){
        movieService.addFilmCategory(category);
    }

    @RequestMapping("/actorFilms/{actorId}")
    public List<FilmActor> getActorFilmsFromActor(@PathVariable Long actorId){
        return movieService.getActorFilmsFromActorId(actorId);
    }

    @RequestMapping("/filmActors/{filmId}")
    public List<FilmActor> getFilmActorsOfFilm(@PathVariable Long filmId, @RequestParam("name") String lastInitial){
        return movieService.getFilmActorsFromFilmIdAndLastInitial(filmId, lastInitial);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/filmActor")
    public void addFilmActor(@RequestBody FilmActor filmActor){
        movieService.addFilmActor(filmActor);
    }

}
