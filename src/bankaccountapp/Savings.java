package bankaccountapp;

public class Savings extends Account {

    private int depositBoxID;
    private int depositBoxKey;

    /**
     * Constructor to create a savings account
     * @param name
     * @param sN
     * @param initDeposit
     */

    public Savings(String name, String sN, double initDeposit) {
        super(name, sN, initDeposit);
        accountNum = "1" + accountNum;
        setDepositBox();
    }

    /**
     * Method which sets a deposit box ID and deposit box Key
     */

    private void setDepositBox(){
        depositBoxID = (int) (Math.random() * Math.pow(10,3));
        depositBoxKey = (int) (Math.random() * Math.pow(10,4));

    }

    @Override
    public void setRate(){
        rate = getBaseRate() - 0.25;

    }

    /**
     * Show info method for the savings account
     */

    public void showInfo(){
        super.showInfo();
        System.out.println("Account type: Savings" +"\nDeposit Box ID: "+depositBoxID +"\nDeposit Box Key: "+depositBoxKey +"\nRate: " +rate +"%");
    }
}
