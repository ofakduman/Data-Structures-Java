package com.company;

public class Disk_Size extends Component {
    static final private String name = "Disk Size";
    static final private String options = "1- 256 GB\n2- 512 GB\n3- 1TB\n4- 2TB";
    static final private int [] prices = {450, 900, 2000, 4000};
    private int selected = 0;


    public Disk_Size(int selected) {
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
        int selected = super.read_int(1,4,"disk size");
        this.selected = selected;
    }

    /** A method to get price of disk size component
     * @return price of the disk size component*/
    public int get_price(){
        return prices[selected-1];
    }


    public String get_option(){
        if (selected == 1)
            return "256GB";
        else if(selected == 2)
            return "512GB";
        else if(selected == 3)
            return "1TB";
        else if(selected == 4)
            return "2TB";
        else
            return "none";
    }

    @Override
    public String toString(){
        return name + ": " + get_option();
    }
}
