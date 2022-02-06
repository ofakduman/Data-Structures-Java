package com.company;

import java.util.Arrays;

public class VHS extends Video{

    String[] trailers;

    public VHS(String[] supportingActors, String director, String format, double imdb, String title, String majorArtist, int playingTime, int numPlays, double price, byte rate, int relaseYear, String[] trailers) {
        super(supportingActors, director, format, imdb, title, majorArtist, playingTime, numPlays, price, rate, relaseYear);
        this.trailers = trailers;
    }



    public void playMedia(){
        this.incrementPlays();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"VHS{" +
                "trailers=" + Arrays.toString(trailers) +
                '}';
    }
}
