package emailapp;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailCapacity = 500;
    private String altEmail;
    private int defaultPasswordLength =10;


    /**
     * Getters and setters
     */

    public void setMailCapacity(int mailCapacity) {
        this.mailCapacity = mailCapacity;
    }

    public int getMailCapacity() {
        return mailCapacity;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword() {
        return password;
    }



    /**
     * Constructor which creates an email given someone's name
     *
     * @param firstName
     * @param lastName
     */
    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println();
        System.out.println("****** Email created for " + this.firstName + " " + this.lastName + " *******");
        System.out.println();

        this.department = selectDepartment();
        System.out.println("Selected department is: " +this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " +this.password);


        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" +department + ".company.com";
        System.out.println("Your email address is: " +this.email);
        System.out.println();

    }
    /*
        Method to select current department
     */

    private String selectDepartment() {
        System.out.println("Enter the department\n1. For sales\n2. For development\n3. For accounting\n0. To return to previous menu");
        Scanner saleInput = new Scanner(System.in);

        int depChoice = saleInput.nextInt();
        System.out.println();

        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {

            return "development";

        }else if(depChoice == 3 ){
            return "accounting";
        }
        else
            return "";

    }

    /**
     * Method which generates a random password
     * @param length
     * @return
     */
    private String randomPassword(int length){
        String placeholderPass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890";
        char[] password = new char[length];
        for (int i =0 ; i <length; i++){
            int random = (int) (Math.random() * placeholderPass.length());
            password[i] = placeholderPass.charAt(random);

        }
            return new String(password);
    }

    public String showInfo(){

        return "Display Name: " + firstName +" " + lastName +"\n"
                + "Company Email: " + email +'\n' +
                "Mailbox Capacity: " +mailCapacity + "mb";
    }

}

