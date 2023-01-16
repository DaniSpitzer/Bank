public class Customer {

    private String name;
    private Debit debitAccount;
    private Credit creditAccount;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Account askCard(boolean isDebit){
        if(isDebit){
            System.out.println("Congratulation, your debit card is ready to be used");
            debitAccount = Bank.createDebitAccount(this.name);
            return debitAccount;
        } else {
            System.out.println("Congratulation, your credit card is ready to be used");
            creditAccount = Bank.createCreditAccount(this.name);
            return creditAccount;
        }
    }

    public Debit getDebitAccount() {
        return debitAccount;
    }

    public Credit getCreditAccount() {
        return creditAccount;
    }

    private void requestAccount(){
        Account.activeAccount();
    }


}
