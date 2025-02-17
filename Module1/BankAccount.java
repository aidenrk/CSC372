package Module1;
public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount){
        if (amount < 0) {
            System.out.println("Please enter a valid amount!");
        }else{
            balance = balance + amount;
            System.out.println("Your new account balance is: $" + balance);
        }
    }

    public void withdrawal(double amount){
        if (amount < 0) {
            System.out.println("Please enter a valid amount!");
        }else{
            balance = balance - amount;
            System.out.println("Your remaining balance is: $" + balance);
        }
    }

    public void setFName(String firstName) {
        this.firstName = firstName;
    }

    public void setLName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void accountSummary() {
        System.out.println("*** Account Summary ***");
        System.out.println("* First Name: " + firstName);
        System.out.println("* Last Name: " + lastName);
        System.out.println("* Account ID:  " + accountID);
        System.out.println("* Balance: " + balance);
    }


}


    