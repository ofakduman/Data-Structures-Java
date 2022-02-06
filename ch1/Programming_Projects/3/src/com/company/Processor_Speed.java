package com.company;

public class Processor_Speed extends Component {
    static final private String name = "Processor Speed";
    static final private String options = "1- 2.4GHZ\n2- 2.8GHZ\n3- 3.0GHZ\n4- 3.4GHZ\n5- 3.8GHZ";
    static final private int [] prices = {1900, 2000, 2400, 3000, 4000};
    private int selected = 0;

    public Processor_Speed(int selected) {
        this.selected = selected;
    }

    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
    }

    public void readSelected(){
        System.out.println(options+"\n");
        int selected = super.read_int(1,5,name);
        this.selected = selected;
    }

    /** A method to get price of Processor_Speed component
     * @return price of the Processor_Speedv component*/
    public int get_price(){
        return prices[selected-1];
    }

    /** An override method to get option
     * @return selected option*/
    public String get_option(){

        if (selected == 1)
            return "2.4GHZ";
        else if(selected == 2)
            return "2.8GHZ";
        else if(selected == 3)
            return "3.0GHZ";
        else if(selected == 4)
            return "3.4GHZ";
        else if(selected == 5)
            return "3.8GHZ";
        else
            return "none";
    }

    @Override
    public String toString(){
        return name + ": " + get_option();
    }
}
