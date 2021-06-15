package com.josenildo.conference.com.josenildo.conference;

import com.josenildo.conference.com.josenildo.conference.repository.HibernateSpeakerRepositoryImpl;
import com.josenildo.conference.com.josenildo.conference.repository.SpeakerRepository;
import com.josenildo.conference.com.josenildo.conference.service.SpeakerService;
import com.josenildo.conference.com.josenildo.conference.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

}
