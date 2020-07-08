package org.datapersist.movies.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.datapersist.movies.model.key.FilmActorKey;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "film_actor")
public class FilmActor {
    @EmbeddedId
    private FilmActorKey pk;

    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date lastUpdatedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("actorId")
    @JoinColumn(name = "actor_id", referencedColumnName = "actor_id")
    private Actor actor;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("filmId")
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    private Film film;

    public FilmActorKey getPk() {
        return pk;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public Actor getActor() {
        return actor;
    }

    public Film getFilm() {
        return film;
    }
}
