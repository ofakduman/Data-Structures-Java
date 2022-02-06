/**
 * @author Omer F Akduman
 *
 * 20.12.2021
 */


/** Create a pricing system for a company that makes individualized computers, such as you might see
 on a Web site. There are two kinds of computers: notebooks and desktop computers. The customer
 can select the processor speed, the amount of memory, and the size of the disk drive. The customer
 can also choose a CD drive (CD ROM), a DVD drive, or both. For notebooks, there is a
 choice of screen size. Other options are a modem, a network card, or a wireless network. You should
 have an abstract class Computer and subclasses DeskTop and Notebook. Each subclass should have
 methods for calculating the price of a computer, given the base price plus the cost of the different
 options. You should have methods for calculating memory price, hard drive price, and so on. There
 should be a method to calculate shipping cost
 Note: Problem taken without perminent from Data Structures Book by Elliot Koffman & Paul A. T. Wolfgang*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Desktop();
        computer.configurate();
        System.out.println(computer.toString());
        System.out.println(computer.get_total_price());

        Computer computer2 = new Notebook();
        computer2.configurate();
        System.out.println(computer2.toString());
        System.out.println(computer2.get_total_price());

    }
}
