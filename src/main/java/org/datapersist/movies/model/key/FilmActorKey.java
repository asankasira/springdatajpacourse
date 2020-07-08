package org.datapersist.movies.model.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FilmActorKey implements Serializable {
    @Column(name = "actor_id")
    private long actorId;
    @Column(name = "film_id")
    private long filmId;

    public long getActorId() {
        return actorId;
    }

    public long getFilmId() {
        return filmId;
    }
}

