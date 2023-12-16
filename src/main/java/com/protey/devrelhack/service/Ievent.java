package com.protey.devrelhack.service;

import com.protey.devrelhack.domain.Event;

import java.util.List;
import java.util.Optional;

public interface Ievent {
    List<Event> getAllEvents();
    Optional<Event> findById(Long id);
    Event save(Event prd);
    void delete(Long id);
}
