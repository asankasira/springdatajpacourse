package org.datapersist.movies.model.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FilmCategoryKey implements Serializable {
    @Column(name = "film_id")
    private long filmID;
    @Column(name = "category_id")
    private long categoryID;

    public long getFilmID() {
        return filmID;
    }

    public long getCategoryID() {
        return categoryID;
    }
}

