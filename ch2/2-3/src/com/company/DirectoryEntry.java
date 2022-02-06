package com.company;

import java.util.Objects;

public class DirectoryEntry {
    private String name;
    private String number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DirectoryEntry)) return false;
        DirectoryEntry that = (DirectoryEntry) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public DirectoryEntry(String name, String number) {
        this.name = name;
        this.number = number;
    }
}
