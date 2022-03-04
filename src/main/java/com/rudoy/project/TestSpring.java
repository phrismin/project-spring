package com.rudoy.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        )) {

            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            System.out.println(musicPlayer.getName());
            System.out.println(musicPlayer.getVolume());

            Music classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//            Music classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

//            System.out.println(classicalMusic1.equals(classicalMusic2));

        }
    }
}
