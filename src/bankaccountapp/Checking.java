package bankaccountapp;

public class Checking extends Account{

    private int debitCardNumber;
    private int PIN;


    /**
     * Constructor to create a checking account
     * @param name
     * @param sN
     * @param initDeposit
     */

    public Checking(String name, String sN, double initDeposit){
        super(name,sN, initDeposit);
        accountNum = "2" +accountNum;
        setDebitCard();

    }

    /**
     * Method which sets debit card info
     */

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        PIN = (int) (Math.random() * Math.pow(10,4));

    }

    @Override
    public void setRate(){
        rate = getBaseRate() *0.15;
    }

    /**
     * Show info method for the checking account
     */

    public void showInfo(){
        super.showInfo();
        System.out.println("Account type: Checking" +"\nDebit card number: "+debitCardNumber +"\nDebit card PIN: "+PIN +"\nRate: " +rate +"%");
    }
}
