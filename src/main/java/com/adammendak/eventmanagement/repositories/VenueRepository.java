package com.adammendak.eventmanagement.repositories;

import com.adammendak.eventmanagement.model.Venue;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends PagingAndSortingRepository<Venue,Long> {
}
