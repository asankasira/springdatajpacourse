package org.datapersist.movies.model;

import org.datapersist.movies.model.key.FilmCategoryKey;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "film_category")
public class FilmCategory {
    @EmbeddedId
    private FilmCategoryKey pk;

    @Column(name = "last_update", columnDefinition= "TIMESTAMP WITHOUT TIME ZONE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTime;


    @ManyToOne
    @MapsId("filmID")
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    private Film film;
    @ManyToOne
    @MapsId("categoryId")
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public FilmCategoryKey getPk() {
        return pk;
    }

    public void setPk(FilmCategoryKey pk) {
        this.pk = pk;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
