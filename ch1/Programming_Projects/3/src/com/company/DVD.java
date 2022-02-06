package com.company;

public class DVD extends Component{
    static final private String name = "DVD";
    private boolean dvd = false;
    private final static int price = 400;

    public DVD(boolean bl){
        dvd = bl;
    }
    public boolean get_dvd(){return dvd;}

    public void setDvd(boolean dvd) {
        this.dvd = dvd;
    }

    public void setDvd(){
        dvd = read_boolean(name);
    }

    public int get_price() {
        if (dvd==true)
            return price;
        else
            return 0;
    }

    @Override
    public String get_option() {
        if(dvd)
            return "Yes";
        return "No";
    }

    @Override
    public String toString(){
        return name + ": " + get_option();
    }
}
