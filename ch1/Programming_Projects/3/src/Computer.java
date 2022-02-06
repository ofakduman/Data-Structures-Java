import com.company.*;

public abstract class Computer {
    private Processor_Speed processor_speed;
    private Memory memory;
    private Disk_Size disk_size;
    private CD cd;
    private DVD dvd;
    private static final int shipping_price = 95;

    Computer(){
        processor_speed = new Processor_Speed(1);
        memory = new Memory(1);
        disk_size = new Disk_Size(1);
        cd = new CD(false);
        dvd = new DVD(false);
    }
    public void configurate(){
        processor_speed.readSelected();
        memory.readSelected();
        disk_size.readSelected();
        cd.setCd();
        dvd.setDvd();
    }


    public int get_current_pc_price(){
        return processor_speed.get_price() +
                memory.get_price()+
                disk_size.get_price()+cd.get_price()+
                cd.get_price()+dvd.get_price();
    }

    public String get_total_price(){
        int price =  get_current_pc_price() + shipping_price;
        return "Total price is only: " + price + " Turkish Liras";
    }

    @Override
    public String toString(){
        return "Computer Specialities\n"+
                processor_speed.toString()+ "\n"+
                memory.toString()+ "\n"+
                disk_size.toString()+"\n"+
                cd.toString()+"\n"+
                dvd.toString();

    }

}
