package com.company;

public class Casetta extends Audio{
    public Casetta(String title, String majorArtist, int playingTime, int numPlays, double price, byte rate, int relaseYear, boolean is_feat, boolean is_group, boolean is_solo, String feat, String group, String album) {
        super(title, majorArtist, playingTime, numPlays, price, rate, relaseYear, is_feat, is_group, is_solo, feat, group, album);
    }

    public Casetta(String title, String majorArtist, int playingTime, int numPlays, double price, byte rate, int relaseYear) {
        super(title, majorArtist, playingTime, numPlays, price, rate, relaseYear);
    }

    @Override
    public void playMedia() {

    }
}
