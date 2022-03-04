package com.rudoy.project;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<>();
        songs.add("Wind cries Mary");
        songs.add("Rock music1");
        songs.add("Rock music2");
        return songs;
    }
}
