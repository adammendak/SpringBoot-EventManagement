package com.adammendak.eventmanagement.controller;


import com.adammendak.eventmanagement.exceptions.AlreadyCheckedInException;
import com.adammendak.eventmanagement.model.Event;
import com.adammendak.eventmanagement.model.Participant;
import com.adammendak.eventmanagement.repositories.EventRepository;
import com.adammendak.eventmanagement.repositories.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private ParticipantRepository participantRepository;

    @PostMapping("/start/{id}")
    public ResponseEntity startEvent(@PathVariable Long id ) {
        Event event = eventRepository.findOne(id);

        if(event == null) {
            throw new ResourceNotFoundException();
        }
        event.setStarted(true);
        eventRepository.save(event);

        return ResponseEntity.ok(event.getName() + "has started");
    }

    @PostMapping("/checkIn/{id}")
    public ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long id, PersistentEntityResourceAssembler assembler) {

        Participant participant = participantRepository.findOne(id);

        if(participant != null) {
            if(participant.getCheckedIn()) {
                throw new AlreadyCheckedInException();
            }
        } else {
            throw new ResourceNotFoundException();
        }

        participant.setCheckedIn(true);
        participantRepository.save(participant);


        return ResponseEntity.ok(assembler.toResource(participant));
    }

}
