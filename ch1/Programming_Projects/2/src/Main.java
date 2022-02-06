/**A student is a person, and so is an employee. Create a class Person that has the data attributes
 common to both students and employees (name, social security number, age, gender,
 address, and telephone number) and appropriate method definitions. A student has a
 grade‐point average (GPA), major, and year of graduation. An employee has a department,
 job title, and year of hire. In addition, there are hourly employees (hourly rate, hours worked,
 and union dues) and salaried employees (annual salary). Define a class hierarchy and write an
 application class that you can use to first store the data for an array of people and then display
 that information in a meaningful
 way.*/

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Cegid", "123456897", 31,
                false, "Eskisehir Batikent", "+905555555555");
        Student s = new Student("Patron", "987654312", 33,
                false, "Mersin", "+905000000000", 3.5,
                "Rap", "2024");
        Employee e = new Employee("Saian", "45664564546", 39,
                false, "Mersin", "+90999999999","Usta",
                "kafiye bukucu", 1998);
        HourlyEmployee he = new HourlyEmployee("MC yarali", "-182946846848", 11,
                true, "gel", "+8484848484844", "Oduncu",
                "genel mudur", 88888, 5.7, 98, 31);
        SalariedEmployee se = new SalariedEmployee("Kazim", "89897987987", 43, false,
                "inonu mahellesi", "+904565464666", "keresteci", "isci",
                1071, 9999999);

        Person p_array [] = new Person[5];
        p_array[0] = p;
        p_array[1] = s;
        p_array[2] = e;
        p_array[3] = he;
        p_array[4] = se;

        for (int i =0; i<p_array.length; i++){
            System.out.println(p_array[i].toString());
        }

    }
}
