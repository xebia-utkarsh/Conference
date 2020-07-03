package com.example.service;

import com.example.model.Speaker;
import com.example.repository.HibernateSpeakerRepositoryImpl;
import com.example.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository=new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
