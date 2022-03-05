package com.rudoy.project;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class FolkMusic implements Music {

    @Override
    public String getSong() {
        return "Love, brothers, love";
    }
}
