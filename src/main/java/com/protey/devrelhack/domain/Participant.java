package com.protey.devrelhack.domain;
import com.protey.devrelhack.domain.enums.ExpLevel;
import com.protey.devrelhack.domain.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "participants")
public class Participant{
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) long id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private LocalDate dateOfBirth;
    @Column(nullable = false, updatable = false)
    @CreatedDate
    private LocalDate dateOfRegistration;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private ExpLevel expLevel;
    private Boolean readyForCooperation;
    private String loginTelegram;
    private String loginGitHub;
    private String about;
    @ManyToOne
    private Profession profession;
    @ManyToMany
    @JoinTable(
            name = "participant_interests",
            joinColumns = @JoinColumn(name = "participant_id"),
            inverseJoinColumns = @JoinColumn(name = "interest_id"))
    private Set<Interest> interests;
    @ManyToMany(mappedBy = "participants")
    private List<Event> events;
}
