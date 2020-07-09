package org.datapersist.course.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "language_id")
    private Long id;
    private String name;
    @Column(name = "last_update", columnDefinition= "TIMESTAMP WITH TIME ZONE")
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date lastUpdatedTime;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

}
