package com.adammendak.eventmanagement.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.Instant;

@Entity
public class Participant extends AbstractEntity{

    private String name;
    private String email;
    private Boolean checkedIn;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "ID", nullable = false, updatable = false)
    private Event event;

    public Participant(Long id, Instant created, String name, String email, Boolean checkedIn) {
        super(id, created);
        this.name = name;
        this.email = email;
        this.checkedIn = checkedIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
