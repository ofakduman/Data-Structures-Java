package com.company;

import java.util.Objects;

public abstract class Media {
    private String title;
    private String majorArtist;
    private int playingTime;
    private int numPlays;
    private double price;
    private byte rate;  //0 to 10 your rate point
    private int relaseYear;

    public Media(String title, String majorArtist, int playingTime, int numPlays, double price, byte rate, int relaseYear) {
        this.title = title;
        this.majorArtist = majorArtist;
        this.playingTime = playingTime;
        this.numPlays = numPlays;
        this.price = price;
        this.rate = rate;
        this.relaseYear = relaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMajorArtist() {
        return majorArtist;
    }

    public void setMajorArtist(String majorArtist) {
        this.majorArtist = majorArtist;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public int getNumPlays() {
        return numPlays;
    }

    public void setNumPlays(int numPlays) {
        this.numPlays = numPlays;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte getRate() {
        return rate;
    }

    public void setRate(byte rate) {
        this.rate = rate;
    }

    public int getRelaseYear() {
        return relaseYear;
    }

    public void setRelaseYear(int relaseYear) {
        this.relaseYear = relaseYear;
    }
//constructors getters and setters

    public abstract void playMedia();

    public void incrementPlays(){this.numPlays++;}
    public void setYourRating(byte rate){this.rate = rate;}
    public int getPlayingTime(){return this.numPlays;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return playingTime == media.playingTime && numPlays == media.numPlays && Double.compare(media.price, price) == 0 && rate == media.rate && relaseYear == media.relaseYear && Objects.equals(title, media.title) && Objects.equals(majorArtist, media.majorArtist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, majorArtist, playingTime, numPlays, price, rate, relaseYear);
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", majorArtist='" + majorArtist + '\'' +
                ", playingTime=" + playingTime +
                ", numPlays=" + numPlays +
                ", price=" + price +
                ", rate=" + rate +
                ", relaseYear=" + relaseYear +
                '}';
    }
}
