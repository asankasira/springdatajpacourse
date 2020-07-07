package org.datapersist.movies.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "actor_id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "last_update", columnDefinition="TIMESTAMP WITHOUT TIME ZONE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTime;

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }
}
