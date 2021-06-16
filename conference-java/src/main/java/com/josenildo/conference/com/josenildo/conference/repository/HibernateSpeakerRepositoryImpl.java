package com.josenildo.conference.com.josenildo.conference.repository;

import com.josenildo.conference.com.josenildo.conference.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

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
