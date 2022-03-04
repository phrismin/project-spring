package com.rudoy.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        )) {

            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            System.out.println(musicPlayer.playMusic(GenreMusic.ROCK));
            System.out.println(musicPlayer.playMusic(GenreMusic.CLASSICAL));


        }
    }
}
