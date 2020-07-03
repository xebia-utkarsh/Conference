package com.example.repository;

import com.example.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    public List<Speaker> findAll(){
        List<Speaker> speakers=new ArrayList<Speaker>();

        Speaker speaker=new Speaker();
        speaker.setFirstName("Utkarsh");
        speaker.setLastName("Singh");

        speakers.add(speaker);
        return speakers;
    }
}
