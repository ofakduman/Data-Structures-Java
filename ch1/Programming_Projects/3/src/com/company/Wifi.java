package com.company;

public class Wifi extends Component{
    static final private String name = "Wifi";
    private boolean wifi = false;
    private final static int price = 90;

    public boolean get_wifi(){return wifi;}

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setWifi(){
        wifi = read_boolean(name);
    }

    public int get_price() {
        if (wifi==true)
            return price;
        else
            return 0;
    }

    @Override
    public String get_option() {
        if(wifi)
            return "Yes";
        return "No";
    }

    @Override
    public String toString(){
        return name + ": " + get_option();
    }
}
