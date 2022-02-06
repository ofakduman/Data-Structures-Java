package com.company;

public class CD extends Component{
    static final private String name = "CD";
    private boolean cd = false;
    private final static int price = 330;

    public CD(boolean bl){
        cd = bl;
    }
    public boolean get_cd(){return cd;}

    public void setCd(boolean cd) {
        this.cd = cd;
    }

    public void setCd(){
        cd = read_boolean(name);
    }

    public int get_price() {
        if (cd==true)
            return price;
        else
            return 0;
    }

    @Override
    public String get_option() {
        if(cd)
            return "Yes";
        return "No";
    }

    @Override
    public String toString(){
        return name + ": " + get_option();
    }
}
