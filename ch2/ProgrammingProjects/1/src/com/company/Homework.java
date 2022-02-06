package com.company;

import java.util.*;
import java.util.function.Consumer;

public class Homework implements Comparable<Homework> {
    private String course;
    private Date deadline;
    private Date givenDay;
    private String note;

    public Homework(String course, Date deadline, Date givenDay, String note) {
        this.course = course;
        this.deadline = deadline;
        this.givenDay = givenDay;
        this.note = note;
    }

    public Homework(String course, Date deadline, String note) {
        this.course = course;
        this.deadline = deadline;
        this.givenDay = new Date();
        this.note = note;
    }

    public Homework(String course, Date deadline) {
        this.course = course;
        this.deadline = deadline;
        this.givenDay = new Date();
        this.note = "";
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getGivenDay() {
        return givenDay;
    }

    public void setGivenDay(Date givenDay) {
        this.givenDay = givenDay;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    /**
     * A method to set deadline
     */
    public void setDeadline(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Day: ");
        int day = getIntValue(in);
        System.out.print("Enter month: ");
        int month = getIntValue(in);

        Date tempDay = new Date();
        tempDay.setMonth(month);
        tempDay.setDate(day);

        deadline = tempDay;
    }

    /**
     *  A method to get int value
     * @param scan
     * @return an int valid criterias
     */
    public static int getIntValue(Scanner scan){
        int nextInt = 0;
        boolean validInt = false;
        while(!validInt){
            try{
                nextInt = scan.nextInt();
                validInt = true;
            } catch (InputMismatchException ex){
                scan.nextLine(); // clear buffer
                System.out.println("Bad data -- enter an integer number");
            }
        }
        return nextInt;
    }

    @Override
    /**
     * A method to compare homework deadline days
     * @return 0 if deadline date is equal
     *          1 if deadline is later than other Homework
     *          else return -1
     */
    public int compareTo(Homework o) {
        Homework other = (Homework) o;
        return deadline.compareTo(other.deadline);    }

    @Override
    public String toString() {
        return "Homework{" +
                "course='" + course + '\'' +
                ", deadline=" + deadline +
                ", givenDay=" + givenDay +
                ", note='" + note + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Homework)) return false;
        Homework homework = (Homework) o;
        return Objects.equals(getCourse(), homework.getCourse()) && Objects.equals(getDeadline(),
                homework.getDeadline()) && Objects.equals(getGivenDay(), homework.getGivenDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourse(), getDeadline(), getGivenDay(), getNote());
    }
}
