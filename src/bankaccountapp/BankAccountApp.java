package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String args[]){

        List<Account> accounts = new LinkedList<Account>();
        int count =1;

        String file = "C:\\Users\\Ali\\IdeaProjects\\EmailApplication\\NewBankAccounts.csv";

//        Checking check1 = new Checking("John Doe", "4531224", 1500.0);
//        System.out.println();
//        Savings sav1 = new Savings("Ava Wilson", "4538763", 20000.0);
//
//        check1.showInfo();
//        System.out.println();
//        sav1.showInfo();
//        System.out.println();
//
//        sav1.compound();
//        check1.deposit(200);
//        sav1.withdraw(2000);
//        check1.transfer("Real estate", 500);

        List<String[]> newAccountHolders = utilities.CSV.read(file);

        for(String[] accountHolder: newAccountHolders) {
            String name = accountHolder[0];
            String serialNumber = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, serialNumber, initDeposit));

            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, serialNumber, initDeposit));

            } else {
                System.out.println("No such account type exists");
            }
        }
            for (Account acc:accounts){
                System.out.println("\nAccount holder #" +count);
                acc.showInfo();
                count++;
                System.out.println();
            }
        }


    }

