public class Student extends Person{
    private double gpa;
    private String major;
    private String year_of_graduation;


    // Constructor
    public Student(String name, String ss_number, int age,
                   boolean gender, String address, String tel_number) {
        super(name, ss_number, age, gender, address, tel_number);
    }

    public Student(String name, String ss_number, int age, boolean gender,
                   String address, String tel_number, double gpa, String major,
                   String year_of_graduation) {
        super(name, ss_number, age, gender, address, tel_number);
        this.gpa = gpa;
        this.major = major;
        this.year_of_graduation = year_of_graduation;
    }

    // Accessors and modifiers
    public double getGpa() {return gpa;}
    public void setGpa(double gpa) {this.gpa = gpa;}
    public String getMajor() {return major;}
    public void setMajor(String major) {this.major = major;}
    public String getYear_of_graduation() {return year_of_graduation;}
    public void setYear_of_graduation(String year_of_graduation) {this.year_of_graduation = year_of_graduation;}


    @Override
    /** An overrided method to show info abour Student classes objects
     * @return informations of the Student's objects*/
    public String toString(){
        return super.toString() +
                "\nGPA: " + this.gpa +
                "\nMajor: " + this.major +
                "\nYear of graduation: " + this.year_of_graduation;
    }
}
