package com.rudoy.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    private List<Music> genreMusicList;

//    @Autowired
    public MusicPlayer(List<Music> genreMusicList) {
        this.genreMusicList = genreMusicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();
        int randomInt = random.nextInt(genreMusicList.size());

        return "Playing: " + genreMusicList.get(randomInt).getSong() + ". With volume: "
                +  volume;
    }
}
