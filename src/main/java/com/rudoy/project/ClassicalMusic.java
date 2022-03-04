package com.rudoy.project;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

@Component
//@Scope("singleton")
//@Scope("prototype")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doInit() {
        System.out.println("Doing initialization");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Doing destroying");
    }

    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<>();
        songs.add("Hungarian Rhapsody");
        songs.add("Classical music1");
        songs.add("Classical music2");
        return songs;
    }
}
