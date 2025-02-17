package Module1;
public class test {
    public static void main(String[] args) {
        BankAccount testAcc = new BankAccount();
        testAcc.setFName("Aiden");
        testAcc.setLName("Kyzer");
        testAcc.setAccountID(21123);
        testAcc.deposit(1942);
        System.out.println("\n");
        testAcc.withdrawal(442);
        System.out.println("\n");
        testAcc.accountSummary();

        CheckingAccount testChecking = new CheckingAccount();
        testChecking.setFName("Caroline");
        testChecking.setLName("Payne");
        testChecking.setAccountID(812000);
        System.out.println("\n");
        testChecking.deposit(1000);
        System.out.println("\n");
        testChecking.processWithdrawal(1500);
        System.out.println("\n");
        testChecking.displayAccount();



        
    }
}
