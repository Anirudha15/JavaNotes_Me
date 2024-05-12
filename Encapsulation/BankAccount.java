
// 78 Define a BankAccount class with private attribute like accountNumber,accountHolderName,and balance.
//  Provide public methods to deposit and withdraw money,ensuring that these methods dont allow illegal operation like withdrawing
// more money that the current balance.

package Encapsulation;



public class BankAccount {
    
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money){
        if(money <=0){
            System.out.println("Invalid deposit");
        }
        else{
            balance +=money;
        }
    }

    public double withdrawMoney(double money){
        if(balance <=0){
            System.out.println("Invalid Withdraw");
        }else if(balance >= money){
            balance -=money;
        }else{
            money = balance;
            balance =0;
        }
        return money;
    }
}
