package com.josenildo.conference.com.josenildo.conference.service;

import com.josenildo.conference.com.josenildo.conference.model.Speaker;
import com.josenildo.conference.com.josenildo.conference.repository.HibernateSpeakerRepositoryImpl;
import com.josenildo.conference.com.josenildo.conference.repository.SpeakerRepository;

import java.util.*;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    //Construtor injection
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
