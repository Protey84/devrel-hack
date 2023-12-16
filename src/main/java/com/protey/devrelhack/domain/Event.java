package com.protey.devrelhack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
@Entity
public class Event {
    private @Id @GeneratedValue long id;
    private String title;
    private String description;
    private List<Interest> interests;
    private LocalDateTime start;
    private LocalDateTime end;
    private List<Participant> registeredParticipant;
    private List<Participant> involvedParticipant;
}
