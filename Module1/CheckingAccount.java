package Module1;
public class CheckingAccount extends BankAccount {
    private double interestRate = 7;

    public void processWithdrawal(double amount) {
        if ((this.getBalance() - amount) < 0 ) {
            this.withdrawal(amount + 30);
            System.out.println("Your New Balance Is: $" + this.getBalance());
            System.out.println("A 30$ Overdraft Fee Has Been Collected From Your Account!!!");
        }else{
            this.withdrawal(amount);
            System.out.println("Your New Balance Is: $" + this.getBalance());
        }
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("* Interest Rate: %" + (interestRate));
    }

    
}

