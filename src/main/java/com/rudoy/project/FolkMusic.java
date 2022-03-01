package com.rudoy.project;

public class FolkMusic implements Music {
    private FolkMusic() {
    }

    public static FolkMusic getFolkMusic() {
        return new FolkMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initializatioin");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destroying");
    }

    @Override
    public String getSong() {
        return "Love, brothers, love";
    }
}
