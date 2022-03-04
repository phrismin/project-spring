package com.rudoy.project;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<>();
        songs.add("Hungarian Rhapsody");
        songs.add("Classical music1");
        songs.add("Classical music2");
        return songs;
    }
}
