package org.datapersist.movies.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "category_id")
    private long categoryID;
    private String name;
    @Column(name = "last_update", columnDefinition="TIMESTAMP WITHOUT TIME ZONE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTime;

    public long getCategoryID() {
        return categoryID;
    }

    public String getName() {
        return name;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }
}
