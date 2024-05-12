package Encapsulation;

public class Customer {
    
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("001", "Anirudha Shinde");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-45);
        account.withdrawMoney(0);
    }
    
}
