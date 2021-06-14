package com.josenildo.conference.com.josenildo.conference.repository;

import com.josenildo.conference.com.josenildo.conference.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
