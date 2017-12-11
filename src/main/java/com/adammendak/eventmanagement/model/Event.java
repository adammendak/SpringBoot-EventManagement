package com.adammendak.eventmanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

@Entity
public class Event extends AbstractEntity{

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    @JsonProperty("desc")
    private String description;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private ZoneId zoneId;
    private Boolean started;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private Organizer organizer;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "event")
    private Set<Participant> participant;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @RestResource(exported = false)
    private Venue venue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }

    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Set<Participant> getParticipant() {
        return participant;
    }

    public void setParticipant(Set<Participant> participant) {
        this.participant = participant;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (name != null ? !name.equals(event.name) : event.name != null) return false;
        if (description != null ? !description.equals(event.description) : event.description != null) return false;
        if (startTime != null ? !startTime.equals(event.startTime) : event.startTime != null) return false;
        if (endTime != null ? !endTime.equals(event.endTime) : event.endTime != null) return false;
        if (zoneId != null ? !zoneId.equals(event.zoneId) : event.zoneId != null) return false;
        if (started != null ? !started.equals(event.started) : event.started != null) return false;
        if (organizer != null ? !organizer.equals(event.organizer) : event.organizer != null) return false;
        if (participant != null ? !participant.equals(event.participant) : event.participant != null) return false;
        return venue != null ? venue.equals(event.venue) : event.venue == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (zoneId != null ? zoneId.hashCode() : 0);
        result = 31 * result + (started != null ? started.hashCode() : 0);
        result = 31 * result + (organizer != null ? organizer.hashCode() : 0);
        result = 31 * result + (participant != null ? participant.hashCode() : 0);
        result = 31 * result + (venue != null ? venue.hashCode() : 0);
        return result;
    }
}
