package com.company;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private static List<DirectoryEntry> theDirectory =
            new ArrayList<>();

    public List<DirectoryEntry> getTheDirectory() {
        return theDirectory;
    }

    public void setTheDirectory(List<DirectoryEntry> theDirectory) {
        this.theDirectory = theDirectory;
    }

    public static void main(String[] args){
        theDirectory.add(new DirectoryEntry("Jane Smith", "555‐549‐1234"));
        addOrChangeEntry("Jane Smith", "99331313319");
        addOrChangeEntry("Avni Celik", "3131331131");
        print();
        removeEntry("Jane Smith");
        System.out.println("sssssssssss");
        print();
    }

    /** Add an entry to theDirectory or change an existing entry.
     @param aName The name of the person being added or changed
     @param newNumber The new number to be assigned
     @return The old number, or if a new entry, null
     */
    public static String addOrChangeEntry(String aName, String newNumber) {

        for (int i = 0; i < theDirectory.size(); i++) {
            if (theDirectory.get(i).equals(new DirectoryEntry(aName,""))) {
                String oldNumber = theDirectory.get(i).getNumber();
                System.out.println("girdi");
                theDirectory.get(i).setNumber(newNumber);
                return oldNumber;
            }
        }
        theDirectory.add(new DirectoryEntry(aName, newNumber));
        return null;
    }

    public static void print(){
        DirectoryEntry aEntry;
        for (int i = 0; i < theDirectory.size(); i++) {
            aEntry = theDirectory.get(i);
            System.out.println("name: " +  aEntry.getName() + "\tTel no: "+ aEntry.getNumber());
        }
    }

    /** Remove an entry.
     @param aName The name of the person being removed
     @return The entry removed, or null if there is no entry for aName
     */
    public static DirectoryEntry removeEntry(String aName) {
        for (int i = 0; i < theDirectory.size(); i++) {
            if (theDirectory.get(i).equals(new DirectoryEntry(aName, ""))) {
                return theDirectory.remove(i);
            }
        }
        return null;
    }
}
