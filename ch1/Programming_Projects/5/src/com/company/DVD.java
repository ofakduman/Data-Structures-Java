package com.company;

import java.util.Arrays;

public class DVD extends Video {
    String[] specialFeatures;
    boolean wideScreenFormat;
    boolean TVFormat;
    String[] soundOptions;

    public DVD(String[] supportingActors, String director, String format, double imdb, String title, String majorArtist, int playingTime, int numPlays, double price, byte rate, int relaseYear, String[] specialFeatures, boolean wideScreenFormat, boolean TVFormat, String[] soundOptions) {
        super(supportingActors, director, format, imdb, title, majorArtist, playingTime, numPlays, price, rate, relaseYear);
        this.specialFeatures = specialFeatures;
        this.wideScreenFormat = wideScreenFormat;
        this.TVFormat = TVFormat;
        this.soundOptions = soundOptions;
    }

    public void playMedia(){
        this.incrementPlays();
    }

    @Override
    public String toString() {
        return "DVD{" +
                "specialFeatures=" + Arrays.toString(specialFeatures) +
                ", wideScreenFormat=" + wideScreenFormat +
                ", TVFormat=" + TVFormat +
                ", soundOptions=" + Arrays.toString(soundOptions) +
                '}';
    }
}
