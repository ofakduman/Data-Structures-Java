import com.company.*;

public class Notebook extends Computer{
    private Screen_Size screen_size;
    private Modem modem;
    private Network_Card card;
    private Wifi wifi;

    public Notebook(){
        super();
        screen_size = new Screen_Size(0);
        modem = new Modem();
        card = new Network_Card();
        wifi = new Wifi();
    }

    private static final int base_price = 1000;
    private static final String name = "Notebook";


    @Override
    public void configurate() {
        super.configurate();
        screen_size.readSelected();
        modem.setModem();
        card.setCard();
        wifi.setWifi();
    }

    @Override
    public int get_current_pc_price(){
        return super.get_current_pc_price() + base_price + screen_size.get_price()+
                modem.get_price()+ card.get_price()+ wifi.get_price();
    }

    public String get_total_price(){
        return "Total price is only: " + get_current_pc_price() + " Turkish Liras";
    }

    @Override
    public String toString(){
        return "Kind: " + name  + "\n"+ super.toString();
    }
}
