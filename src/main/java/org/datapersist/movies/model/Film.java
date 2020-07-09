package org.datapersist.movies.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "film_id")
    private long filmID;
    private String title;
    @Column(name = "language_id")
    private int languageID;
    @Column(name = "rental_duration")
    private int rentalDuration;
    @Column(name = "rental_rate")
    private double rentalRate;
    @Column(name = "replacement_cost")
    private double replacementCost;
    @Column(name = "last_update", columnDefinition= "TIMESTAMP WITHOUT TIME ZONE")
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date lastUpdatedTime;

    public long getFilmID() {
        return filmID;
    }

    public String getTitle() {
        return title;
    }

    public int getLanguageID() {
        return languageID;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }
}
