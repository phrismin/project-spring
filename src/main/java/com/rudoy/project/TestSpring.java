package com.rudoy.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        )) {

            MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

            System.out.println(musicPlayer1.getVolume());
        }
    }
}
