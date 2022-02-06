public class Cat extends Pet{

    // data fields
    private boolean vaccines_full;

    Cat(int _id, String _diet, String _owner, boolean _sex){
        super(_id, "Cat", _diet, _owner, false, false, false, _sex);
    }

    public boolean isVaccines_full() {
        return vaccines_full;
    }

    public void setVaccines_full(boolean vaccines_full) {
        this.vaccines_full = vaccines_full;
    }
}
