package com.rudoy.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        )) {

//            Music music1 = context.getBean("rockMusic", Music.class);
//            MusicPlayer musicPlayer = new MusicPlayer();
//            musicPlayer.setMusic(music1);
//
//            Music music2 = context.getBean("folkMusic", Music.class);
//            musicPlayer.setMusic(music2);
//
//            System.out.println(music1.getSong());
//            System.out.println(music2.getSong());

//            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//            musicPlayer.playMusic();

            Computer computer = context.getBean("computer", Computer.class);
            System.out.println(computer);

        }
    }
}
