package com.company;

import java.util.Arrays;
import java.util.Objects;

public abstract class Video extends Media {
    private String[] supportingActors;
    private String director;
    private String format;
    private double imdb;

    public Video(String[] supportingActors, String director, String format, double imdb,String title, String majorArtist, int playingTime, int numPlays, double price, byte rate, int relaseYear) {
        super(title, majorArtist, playingTime, numPlays, price, rate, relaseYear);
        this.supportingActors = supportingActors;
        this.director = director;
        this.format = format;
        this.imdb = imdb;
    }


    @Override
    public String toString() {
        return super.toString() +"\n"+ "Video{" +
                "supportingActors=" + Arrays.toString(supportingActors) +
                ", director='" + director + '\'' +
                ", format='" + format + '\'' +
                ", imdb=" + imdb +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video)) return false;
        if (!super.equals(o)) return false;
        Video video = (Video) o;
        return Double.compare(video.getImdb(), getImdb()) == 0 && Arrays.equals(getSupportingActors(), video.getSupportingActors()) && Objects.equals(getDirector(), video.getDirector()) && Objects.equals(getFormat(), video.getFormat());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), getDirector(), getFormat(), getImdb());
        result = 31 * result + Arrays.hashCode(getSupportingActors());
        return result;
    }

    public String[] getSupportingActors() {
        return supportingActors;
    }

    public void setSupportingActors(String[] supportingActors) {
        this.supportingActors = supportingActors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getImdb() {
        return imdb;
    }

    public void setImdb(double imdb) {
        this.imdb = imdb;
    }
}
