package com.protey.devrelhack.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "interests")
public class Interest {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) long id;
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "interests")
    private Set<Participant> participants;
    @ManyToMany(mappedBy = "interests")
    private Set<Event> events;
}
