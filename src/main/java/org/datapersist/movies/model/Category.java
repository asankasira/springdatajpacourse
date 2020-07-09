package org.datapersist.movies.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "catgSeq")
    @SequenceGenerator(name = "catgSeq", sequenceName = "category_category_id_seq", allocationSize = 1)
    @Column(name = "category_id")
    private long categoryID;
    private String name;
    @Column(name = "last_update", columnDefinition="TIMESTAMP WITHOUT TIME ZONE")
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
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
