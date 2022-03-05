package com.rudoy.project.config;

import com.rudoy.project.*;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("com.rudoy.project")
@PropertySource("musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public FolkMusic folkMusic() {
        return new FolkMusic();
    }

    @Bean
    public List<Music> genreMusicList() {
        return Arrays.asList(rockMusic(), folkMusic(), classicalMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(genreMusicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
