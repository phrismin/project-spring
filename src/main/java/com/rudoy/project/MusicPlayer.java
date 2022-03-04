package com.rudoy.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicMusic") Music music1,
                       @Qualifier("folkMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(GenreMusic genreMusic) {
        Random random = new Random();
        int randomInt = random.nextInt(3);

        if (GenreMusic.CLASSICAL.equals(genreMusic)) {
            return "Playing: " + music1.getSong().get(randomInt);

        } else if (GenreMusic.ROCK.equals(genreMusic)) {
            return "Playing: " + music2.getSong().get(randomInt);

        } else {
            return "Nothing playing!";
        }
    }
}
