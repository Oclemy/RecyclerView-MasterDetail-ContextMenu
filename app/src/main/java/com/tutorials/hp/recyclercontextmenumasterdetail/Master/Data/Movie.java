package com.tutorials.hp.recyclercontextmenumasterdetail.Master.Data;

/**
 * Created by Oclemmy on 4/8/2016 for ProgrammingWizards Channel.
 */
public class Movie {

    private String name;
    private int image;

    public Movie(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
