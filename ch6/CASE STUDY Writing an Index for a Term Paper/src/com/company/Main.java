package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here

        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        IndexGenerator id =new IndexGenerator();
        id.buildIndex(myReader);
        id.showIndex();
        myReader.close();

    }
}
