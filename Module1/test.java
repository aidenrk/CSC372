public class test {
    public static void main(String[] args) {
        BankAccount testAcc = new BankAccount();
        testAcc.setFName("Aiden");
        testAcc.setLName("Kyzer");
        testAcc.setAccountID(21123);
        testAcc.deposit(1942);
        testAcc.withdrawal(442);
        testAcc.accountSummary();

        CheckingAccount testChecking = new CheckingAccount();
        testChecking.setFName("Caroline");
        testChecking.setLName("Payne");
        testChecking.setAccountID(812000);
        testChecking.deposit(1000);
        testChecking.processWithdrawal(1500);
        testChecking.displayAccount();



        
    }
}
