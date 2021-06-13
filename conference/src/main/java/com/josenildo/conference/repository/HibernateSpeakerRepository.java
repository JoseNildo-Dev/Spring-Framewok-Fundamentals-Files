package com.josenildo.conference.repository;

import com.josenildo.conference.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepository implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("José");
        speaker.setLastName("Pereira");

        speakers.add(speaker);

        return speakers;
    }
}
