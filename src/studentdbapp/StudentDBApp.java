package studentdbapp;
import java.util.Scanner;

public class StudentDBApp {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


       /*
       Ask how many students you would want to enroll
        */
        System.out.println("How many students would you like to enroll?");
        int nbOfStudents = in.nextInt();
        Student[] students = new Student[nbOfStudents];

        for(int i =0 ; i < nbOfStudents; i++){
            System.out.println();
            System.out.println("****** Student number " +(i+1)+ " ******");
            students[i] = new Student();
            students[i].enroll();
            students[i].viewBalance();
            students[i].payTuition();
            System.out.println(students[i].showInfo());

        }

    }
}
