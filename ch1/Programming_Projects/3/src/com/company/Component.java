package com.company;

import java.util.Scanner;

public abstract class Component {

    /** A method to read from user's input to decide user decision
     * @return true if user want to desired component
     *          else returns false*/
    public boolean read_boolean(String name){
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Do you want to "+ name + "\nYes (y), No (n): ");
        String str= sc.nextLine();              //reads string
        if(str.length()>0 && (str.charAt(0)== 'y' ||str.charAt(0) =='Y'))
            return true;
        return false;
    }

    /** A method to get int value from user to select wanted component.
     * @param base and
     *      @param up  are wanted interval values
     *@return number is wanted component */
    public int read_int(int base, int up, String component_name) {
        Scanner int_input = new Scanner(System.in);
        int number = 0;
        boolean flag;
        do {
            flag = true;
            try {
                System.out.print("Enter the selected " + component_name + ": ");
                number = Integer.parseInt(int_input.next());

                if (up >= number && number >= base)
                    flag = false;
                else
                    System.out.println("Please enter properly an input! ");

            } catch (Exception e) {
                System.out.println("Error!");
                int_input.reset();
            }
            System.out.println(number);
        } while (flag);

        return number;
    }

    /** An abstract method to get component price*/
    public abstract int get_price();

    /**An overrided function to get info*/
    @Override
    public abstract String toString();

    /** An abstract function to get option of component*/
    public abstract String get_option();
}
