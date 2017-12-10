package com.adammendak.eventmanagement.repositories;

import com.adammendak.eventmanagement.model.Organizer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {
}
