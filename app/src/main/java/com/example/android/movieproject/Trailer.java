package com.example.android.movieproject;

import java.io.Serializable;

/**
 * Created by carolinestewart on 6/8/16.
 */
public class Trailer implements Serializable {
    public final String key;
    public final String name;

    public Trailer(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }
}
