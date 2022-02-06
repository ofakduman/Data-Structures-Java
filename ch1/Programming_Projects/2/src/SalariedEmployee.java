public class SalariedEmployee extends Employee{
    private int annual_salary;

    // Constructors
    public SalariedEmployee(String name, String ss_number, int age, boolean gender, String address, String tel_number, int annual_salary) {
        super(name, ss_number, age, gender, address, tel_number);
        this.annual_salary = annual_salary;
    }

    public SalariedEmployee(String name, String ss_number, int age, boolean gender, String address, String tel_number, String department, String job_title, int year_of_hire, int annual_salary) {
        super(name, ss_number, age, gender, address, tel_number, department, job_title, year_of_hire);
        this.annual_salary = annual_salary;
    }

    // Accessors and modifiers
    public int getAnnual_salary() {
        return annual_salary;
    }

    public void setAnnual_salary(int annual_salary) {
        this.annual_salary = annual_salary;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nAnnual salary:" + this.annual_salary;
    }
}
