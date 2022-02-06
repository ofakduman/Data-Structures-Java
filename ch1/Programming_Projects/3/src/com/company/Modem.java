package com.company;

public class Modem extends Component{
    static final private String name = "Modem";
    private boolean modem = false;
    private final static int price = 30;

    public boolean get_modem(){return modem;}

    public void setModem(boolean modem) {
        this.modem = modem;
    }

    public void setModem(){
        modem = read_boolean(name);
    }

    public int get_price() {
        if (modem==true)
            return price;
        else
            return 0;
    }

    @Override
    public String get_option() {
        if(modem)
            return "Yes";
        return "No";
    }

    @Override
    public String toString(){
        return name + ": " + get_option();
    }
}
