package com.company;

public class Network_Card extends Component{
    static final private String name = "Network Card";
    private boolean card = false;
    private final static int price = 30;

    public boolean get_card(){return card;}

    public void setCard(boolean card) {
        this.card = card;
    }

    public void setCard(){
        card = read_boolean(name);
    }

    public int get_price() {
        if (card==true)
            return price;
        else
            return 0;
    }

    @Override
    public String get_option() {
        if(card)
            return "Yes";
        return "No";
    }

    @Override
    public String toString(){
        return name + ": " + get_option();
    }
}
