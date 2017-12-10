package com.adammendak.eventmanagement.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.Set;

@Entity
public class Organizer extends AbstractEntity {

    private String name;

    @OneToMany(mappedBy = "organizer")
    private Set<Event> events;


    public Organizer(Long id, Instant created, String name) {
        super(id, created);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
