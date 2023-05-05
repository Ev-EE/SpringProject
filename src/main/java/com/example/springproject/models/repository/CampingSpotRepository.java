package com.example.springproject.models.repository;

import com.example.springproject.models.data.CampingSpots;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository(value = "camping_spots")
public interface CampingSpotRepository extends PagingAndSortingRepository<CampingSpots,Long> {

    Page<CampingSpots> findALl(Pageable page);

    List<CampingSpots> findAll();

    Optional<CampingSpots> findCampingSpotById(Long id);

    Optional<CampingSpots> findByAddress(String address);
}
