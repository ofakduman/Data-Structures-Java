public class Horse extends Pet{

    // data fields
    private boolean healthy_teeth;

    Horse(int _id, String _diet, String _owner, boolean _sex){
        super(_id, "Horse", _diet, _owner, false, false, false, _sex);
    }

    public boolean isVaccines_full() {
        return healthy_teeth;
    }

    public void setVaccines_full(boolean vaccines_full) {
        this.healthy_teeth = vaccines_full;
    }
}
