public class HourlyEmployee extends Employee{
    private double hourly_rate;
    private int hours_worked;
    private int union_dues;


    // Constructors
    public HourlyEmployee(String name, String ss_number, int age, boolean gender, String address, String tel_number, double hourly_rate, int hours_worked, int union_dues) {
        super(name, ss_number, age, gender, address, tel_number);
        this.hourly_rate = hourly_rate;
        this.hours_worked = hours_worked;
        this.union_dues = union_dues;
    }

    public HourlyEmployee(String name, String ss_number, int age, boolean gender, String address, String tel_number, String department,
                          String job_title, int year_of_hire, double hourly_rate, int hours_worked, int union_dues) {
        super(name, ss_number, age, gender, address, tel_number, department, job_title, year_of_hire);
        this.hourly_rate = hourly_rate;
        this.hours_worked = hours_worked;
        this.union_dues = union_dues;


    }

    //Accessors and modifiers
    public double getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public int getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(int hours_worked) {
        this.hours_worked = hours_worked;
    }

    public int getUnion_dues() {
        return union_dues;
    }

    public void setUnion_dues(int union_dues) {
        this.union_dues = union_dues;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nHourly rate: " + this.hourly_rate +
                "\nHours worked: " + this.hours_worked +
                "\nUniun dues: " + this.union_dues;
    }

}
