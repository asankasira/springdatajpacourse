package org.datapersist.movies.controller;

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
    public void getFilmCategories(@RequestBody FilmCategory category){
        movieService.addFilmCategory(category);
    }

}
