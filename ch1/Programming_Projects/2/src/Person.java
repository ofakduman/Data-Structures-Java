public class Person {
    private String name;
    private String ss_number;
    private int age;
    private boolean gender; //0 is male 1 is female
    private String address;
    private String tel_number;

    // Constructor
    public Person(String name, String ss_number, int age, boolean gender,
                  String address, String tel_number) {
        this.name = name;
        this.ss_number = ss_number;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.tel_number = tel_number;
    }

    // Accessors and modifiers
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSs_number() {return ss_number;}
    public void setSs_number(String ss_number) {this.ss_number = ss_number;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public boolean isGender() {return gender;}
    public void setGender(boolean gender) {this.gender = gender;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public String getTel_number() {return tel_number;}
    public void setTel_number(String tel_number) {this.tel_number = tel_number;}

    @Override
    /** An overrided method to show info abour person classes objects
     * @return informations of the person's*/
    public String toString(){
        String gender;
        if (true == this.gender)
            gender = "Female";
        else
            gender = "Male";
        return "\nName: " + this.name +
                "\nSocial security number: " + this.ss_number +
                "\nAge: " + this.age +
                "\nGender: " + gender +
                "\nAddress: " + this.address +
                "\nTelephone number: " + this.tel_number ;
    }
}
