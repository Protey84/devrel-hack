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
@Table(name = "professions")
public class Profession {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) long id;
    @Column(name = "name")
    private String name;
    @OneToMany
    @JoinColumn(name = "participant_id")
    private Set<Participant> participants;
}
