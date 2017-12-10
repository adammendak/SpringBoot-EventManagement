package com.adammendak.eventmanagement.repositories;

import com.adammendak.eventmanagement.model.Participant;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {
}
