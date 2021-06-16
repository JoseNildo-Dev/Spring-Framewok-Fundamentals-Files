package com.josenildo.conference.com.josenildo.conference;

import com.josenildo.conference.com.josenildo.conference.repository.HibernateSpeakerRepositoryImpl;
import com.josenildo.conference.com.josenildo.conference.repository.SpeakerRepository;
import com.josenildo.conference.com.josenildo.conference.service.SpeakerService;
import com.josenildo.conference.com.josenildo.conference.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    @Scope(value=BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());

        SpeakerServiceImpl service = new SpeakerServiceImpl();

        return service;
    }

    @Bean(name = "speakRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

}
