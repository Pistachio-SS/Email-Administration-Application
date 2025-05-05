package studentdbapp;

import java.util.Scanner;

public class Student {

    /**
     * Declaration of variables
     */

    private String fName;
    private String lName;
    private int currentYear;
    private String year;
    private int yearNumber;
    private String studentID;
    private String courses = "";
    private int tuition = 0;
    private static int COST = 600;
    private static int id = 1000;


    public Student() {
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.fName = input.nextLine();

        System.out.print("Enter student's last name: ");
        this.lName = input.nextLine();

        System.out.println("Enter student's current grade level:\n1-Freshmen\n2-Sophomore\n3-Junior\n4-Senior");
        this.currentYear = input.nextInt();

        switch (this.currentYear) {

            case 1:
                year = "Freshmen";
                yearNumber = 1;
                break;

            case 2:
                year = "Sophomore";
                yearNumber = 2;
                break;

            case 3:
                year = "Junior";
                yearNumber = 3;
                break;

            case 4:
                year = "Senior";
                yearNumber = 4;
                break;

        }

        setStudentID();

        System.out.println(fName + " " + lName + "\n" + "Current year: " + year + "\n" + "Student ID: " + studentID);


    }

    /**
     * Method to generates an ID
     */
    private void setStudentID() {
        id++;
        this.studentID = yearNumber + "" + id;
    }

    /**
     * Allows the student to enroll
     */

    public void enroll() {

        do {
            System.out.println("Enter the course(s) that you wish to enroll in. (Q to quit):");
            Scanner in = new Scanner(System.in);
            String courseChoice = in.nextLine();
            if (!courseChoice.equals("Q")) {
                courses = courses + "\n" + courseChoice;
                tuition = tuition + COST;

            } else {
                break;
            }

        } while (true);


    }

    /**
     * Method to view balance
     */

    public void viewBalance(){
        System.out.println("Your balance is: " +tuition +"$");


    }

    /**
     * Method to pay the tuition
     */

    public void payTuition(){
        System.out.println("Enter your payment amount: $");
        Scanner keyIn = new Scanner(System.in);
        int payment = keyIn.nextInt();
        tuition = tuition -payment;
        System.out.println();
        System.out.println("Thank you for payment of " +payment +"$");
        viewBalance();
        System.out.println();
    }

    /**
     * Show all the info for a student
     */

    public String showInfo(){

        return "Name: " + fName +" " +lName +"\nStudent ID: " +studentID
                +"\nCurrent Year: " +year
                +"\nCourse(s) Enrolled: "+courses +
                "\nTuition Balance: " +tuition +"$";

    }
}