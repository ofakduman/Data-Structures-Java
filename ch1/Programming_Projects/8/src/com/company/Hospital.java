package com.company;

public class Hospital {
    private Human people[] = new Human[100];
    private int people_counter = 0;
    private int people_size = 100;

    public boolean add_human(Human human){
        if (people_counter == people_size){
            increase_bill_size();
        }
        people[people_counter++] = human;
        return true;
    }

    public void increase_bill_size(){
        Human newPeople[] = new Human[people_size*2];
        for(int i = 0; i<people_counter; i++){
            newPeople[i] = people[i];
        }
        people = newPeople;
        this.people_size = people_size*2;
    }
}
