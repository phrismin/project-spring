package com.rudoy.project;

import com.rudoy.project.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(SpringConfig.class)) {

            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//            System.out.println(musicPlayer.getName());
//            System.out.println(musicPlayer.getVolume());

            Music classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
            Music classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

            System.out.println(musicPlayer.playMusic());
            System.out.println(classicalMusic1.equals(classicalMusic2));

        }
    }
}
