public class Desktop extends Computer{
    private static final int base_price = 2000;
    private static final String name = "Desktop PC";


    @Override
    public void configurate() {
        super.configurate();
    }

    @Override
    public int get_current_pc_price(){
        return super.get_current_pc_price() + base_price;
    }

    public String get_total_price(){
        return "Total price is only: " + get_current_pc_price() + " Turkish Liras";
    }

    @Override
    public String toString(){
        return "Kind: " + name  + "\n"+ super.toString();
    }
}
