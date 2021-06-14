package com.josenildo.conference;

import com.josenildo.conference.com.josenildo.conference.service.SpeakerService;
import com.josenildo.conference.com.josenildo.conference.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {

        return new SpeakerServiceImpl();
    }
}
