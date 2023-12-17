package com.protey.devrelhack.service;

import com.protey.devrelhack.domain.Event;
import com.protey.devrelhack.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService implements Ievent{

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }

    @Override
    public Event save(Event prd) {
        return eventRepository.save(prd);
    }

    @Override
    public void delete(Long id) {
        eventRepository.deleteById(id);
    }
}
