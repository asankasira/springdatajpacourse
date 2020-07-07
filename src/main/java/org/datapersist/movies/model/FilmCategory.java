package org.datapersist.movies.model;

import org.datapersist.movies.model.key.FilmCategoryKey;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "film_category")
public class FilmCategory {
    @EmbeddedId
    private FilmCategoryKey pk;

    @Column(name = "last_update", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTime;


    @ManyToOne
    @MapsId("filmID")
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    private Film film;
    @ManyToOne
    @MapsId("categoryID")
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public FilmCategoryKey getPk() {
        return pk;
    }

    public Film getFilm() {
        return film;
    }

    public Category getCategory() {
        return category;
    }
}
