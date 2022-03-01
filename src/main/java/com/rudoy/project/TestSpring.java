package com.rudoy.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        try {
            Music music = context.getBean("musicBean", Music.class);

            // DI
            MusicPlayer musicPlayer = new MusicPlayer(music);

            musicPlayer.playMusic();

        } finally {
            context.close();
        }
    }
}
