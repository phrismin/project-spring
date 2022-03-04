package com.rudoy.project;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FolkMusic implements Music {

    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<>();
        songs.add("Love, brothers, love");
        songs.add("Folk music1");
        songs.add("Folk music2");
        return songs;
    }
}
