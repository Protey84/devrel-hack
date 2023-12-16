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
import java.util.HashSet;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "participants")
public class Participant{
    private @Id @GeneratedValue long id;
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
    private Profession profession;
    private HashSet<Interest> interests;
    @ManyToMany(mappedBy = "participants")
    private List<Event> events;
}
