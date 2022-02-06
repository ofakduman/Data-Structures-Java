package com.company;

import java.util.Iterator;
import java.util.ListIterator;

public class Homeworks {
    OrderedList<Homework> homeworks = new OrderedList<>();

    public void add(Homework hw){
        homeworks.add(hw);
    }

    public void remove(Homework hw){
        homeworks.remove(hw);
    }

    public void showAll(){
        ListIterator<Homework> iter = (ListIterator<Homework>) homeworks.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public Homework getEarliest(){
        if (homeworks.size()>0)
            return homeworks.get(0);
        return null;
    }


}
