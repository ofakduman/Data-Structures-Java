package com.company;

public class Memory extends Component {
    static final private String name = "Memory";
    static final private String options = "1- 8GB\n2- 12GB\n3- 16GB\n4- 32GB\n5- 64GB";
    static final private int [] prices = {900, 1600, 2400, 5000, 9000};
    private int selected = 0;

    public Memory(int selected) {
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

    /** A method to get price of memory component
     * @return price of the memory component*/
    public int get_price(){
        return prices[selected-1];
    }

    /** An override method to get option
     * @return selected option*/
    public String get_option(){
        if (selected == 1)
            return "8GB";
        else if(selected == 2)
            return "12GB";
        else if(selected == 3)
            return "16GB";
        else if(selected == 4)
            return "32GB";
        else if(selected == 5)
            return "64GB";
        else
            return "none";
    }

    @Override
    public String toString(){
        return name + ": " + get_option();
    }
}
