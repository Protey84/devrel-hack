package com.protey.devrelhack.domain;
import com.protey.devrelhack.domain.enums.ExpLevel;
import com.protey.devrelhack.domain.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Participant extends User{
    private String email;
    private String phone;
    private LocalDate dateOfBirth;
    private LocalDate dateOfRegistration;
    private Gender gender;
    private ExpLevel expLevel;
    private Boolean readyForCooperation;
    private String loginTelegram;
    private String loginGitHub;
    private String about;
    private Profession profession;
    private List<Interes> interests;
}
