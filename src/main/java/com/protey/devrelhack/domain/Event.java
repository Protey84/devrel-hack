package com.protey.devrelhack.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private long idEvent;
    private String title;
    private String description;
    private List<Interes> interests;
    private LocalDateTime start;
    private LocalDateTime end;
    private List<Participant> registeredParticipant;
    private List<Participant> involvedParticipant;
}
