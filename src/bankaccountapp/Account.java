package bankaccountapp;

public abstract class Account implements IBaseRate {

    private String name;
    private String serialNumber;
    private double balance;
    private static int index = 10000;
    protected String accountNum;
    protected double rate;

    /**
     * Constructor which creates an account
     * @param name
     * @param sN
     * @param initDeposit
     */

    public Account(String name, String sN, double initDeposit) {
        this.name = name;
        this.serialNumber = sN;
        this.balance = initDeposit;

        index++;
        this.accountNum = setAccountNum();

        setRate();
    }

    public abstract void setRate();

    /**
     * Determines account number
     * @return
     */

    public String setAccountNum() {
        String lastTwoDigitsOfSN = serialNumber.substring(serialNumber.length()-2, serialNumber.length());
        int uniqueID = index;
        int randomNum = (int) (Math.random() * Math.pow(10,3));
        return lastTwoDigitsOfSN + uniqueID +randomNum;

    }

    /**
     * Determines interest rate
     */

    public void compound(){
        double accruedInterest = balance *(rate/100);
        balance = balance +accruedInterest;
        System.out.println("Accrued interest is: " +accruedInterest);
        printBalance();

    }

    /**
     * Deposit method
     * @param amount
     */

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing " +amount +"$");
        printBalance();
    }

    /**
     * Withdraw method
     * @param amount
     */
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing " +amount +"$");
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance -amount;
        System.out.println("Transferring " +amount +"$ " +"to " +toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your current balance is " +balance +"$");
        System.out.println();
    }


    public void showInfo(){
        System.out.println("Name: " +name.toUpperCase() +"\nAccount Number: "+accountNum + "\nBalance: "+balance +"$");
    }
}
