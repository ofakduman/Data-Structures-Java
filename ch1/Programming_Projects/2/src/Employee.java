public class Employee extends Person{
    private String department;
    private String job_title;
    private int year_of_hire;


    //Constructors
    public Employee(String name, String ss_number, int age, boolean gender,
                    String address, String tel_number) {
        super(name, ss_number, age, gender, address, tel_number);
    }

    public Employee(String name, String ss_number, int age, boolean gender, String address,
                    String tel_number, String department, String job_title, int year_of_hire) {
        super(name, ss_number, age, gender, address, tel_number);
        this.department = department;
        this.job_title = job_title;
        this.year_of_hire = year_of_hire;
    }

    // Accessors and modifiers
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public int getYear_of_hire() {
        return year_of_hire;
    }

    public void setYear_of_hire(int year_of_hire) {
        this.year_of_hire = year_of_hire;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nDepartment: " + this.department +
                "\nJob Title: " + this.job_title +
                "\nYear of hire : " + this.year_of_hire;
    }
}
