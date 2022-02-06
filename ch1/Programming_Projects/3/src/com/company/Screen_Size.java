package com.company;

public class Screen_Size extends Component {
    static final private String name = "Screen Size";
    static final private String options = "1- 13 inch\n2- 15 inch\n3- 17 inch\n4- 19 inch";
    static final private int [] prices = {900, 1600, 2400, 2800, 3000};
    private int selected = 0;

    public Screen_Size(int selected) {
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
            return "13 inch";
        else if(selected == 2)
            return "15 inch";
        else if(selected == 3)
            return "17 inch";
        else if(selected == 4)
            return "19 inch";
        else
            return "none";
    }

    @Override
    public String toString(){
        return name + ": " + get_option();
    }
}
