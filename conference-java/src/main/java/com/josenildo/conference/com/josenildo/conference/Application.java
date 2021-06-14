package com.josenildo.conference.com.josenildo.conference;

import com.josenildo.conference.com.josenildo.conference.service.SpeakerService;
import com.josenildo.conference.com.josenildo.conference.service.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {

        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
