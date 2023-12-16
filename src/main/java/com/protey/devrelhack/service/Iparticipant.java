package com.protey.devrelhack.service;

import com.protey.devrelhack.domain.Participant;

import java.util.List;
import java.util.Optional;

public interface Iparticipant {
    List<Participant> getAllParticipant();
    Optional<Participant> findById(Long id);
    Participant save(Participant prd);
    void delete(Long id);
}
