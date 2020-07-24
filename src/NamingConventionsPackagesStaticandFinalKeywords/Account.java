package NamingConventionsPackagesStaticandFinalKeywords;

import java.util.ArrayList;

public class Account {

    private String accountName;
    private int balance =0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if (amount>0){
            this.transactions.add(amount);
            this.balance += amount;
            System.out.println("To the balance amount of: "+amount+" was added");
        }
        else{
            System.out.println("Can't deposit negative sum");
        }
    }

    public void withdraw(int amount ){
        int withdraw = - amount;
        if (withdraw < 0){
            this.transactions.add(withdraw);
            this.balance += withdraw;
            System.out.println(amount+" withdrawn. The current balance is:"+this.balance);
        }
        else{
            System.out.println("Can't withdraw a negative number !");
        }
    }

    public void calculateBalance(){
        this.balance =0 ;
        for (int i:this.transactions){
            this.balance += i;
        }
        System.out.println("Current balance is:"+this.balance);
    }



}
