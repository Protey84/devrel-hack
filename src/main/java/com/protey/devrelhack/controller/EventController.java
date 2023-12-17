package com.protey.devrelhack.controller;

import com.protey.devrelhack.domain.Event;
import com.protey.devrelhack.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EventController {
    @Autowired
    private EventService eventService;
    @GetMapping("/events")
    List<Event> all(){
        return eventService.getAllEvents();
    }


}