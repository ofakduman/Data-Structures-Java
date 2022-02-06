package com.company;

import java.util.Objects;

public abstract class Audio extends Media {
    private boolean is_feat;
    private boolean is_group;
    private boolean is_solo;
    private String feat;
    private String group;
    private String album;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Audio)) return false;
        if (!super.equals(o)) return false;
        Audio audio = (Audio) o;
        return isIs_feat() == audio.isIs_feat() && isIs_group() == audio.isIs_group() && isIs_solo() == audio.isIs_solo() && Objects.equals(getFeat(), audio.getFeat()) && Objects.equals(getGroup(), audio.getGroup()) && Objects.equals(getAlbum(), audio.getAlbum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isIs_feat(), isIs_group(), isIs_solo(), getFeat(), getGroup(), getAlbum());
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Audio{" +
                "is_feat=" + is_feat +
                ", is_group=" + is_group +
                ", is_solo=" + is_solo +
                ", feat='" + feat + '\'' +
                ", group='" + group + '\'' +
                ", album='" + album + '\'' +
                '}';
    }

    public boolean isIs_feat() {
        return is_feat;
    }

    public void setIs_feat(boolean is_feat) {
        this.is_feat = is_feat;
    }

    public boolean isIs_group() {
        return is_group;
    }

    public void setIs_group(boolean is_group) {
        this.is_group = is_group;
    }

    public boolean isIs_solo() {
        return is_solo;
    }

    public void setIs_solo(boolean is_solo) {
        this.is_solo = is_solo;
    }

    public String getFeat() {
        return feat;
    }

    public void setFeat(String feat) {
        this.feat = feat;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Audio(String title, String majorArtist, int playingTime, int numPlays, double price, byte rate, int relaseYear, boolean is_feat, boolean is_group, boolean is_solo, String feat, String group, String album) {
        super(title, majorArtist, playingTime, numPlays, price, rate, relaseYear);
        this.is_feat = is_feat;
        this.is_group = is_group;
        this.is_solo = is_solo;
        this.feat = feat;
        this.group = group;
        this.album = album;
    }

    public Audio(String title, String majorArtist, int playingTime, int numPlays, double price, byte rate, int relaseYear) {
        super(title, majorArtist, playingTime, numPlays, price, rate, relaseYear);
    }
}
