public class Customer {

    private String name;
    private Account[] debitAccounts = new Account[5];
    private Account[] creditAccounts = new Account[5];

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void askCard(boolean isDebit, Bank bank) {
        int accountIndex = 0;
        if (isDebit) {
            System.out.println("Congratulations " + this.name + ", your debit card is ready to be used");
            debitAccounts[accountIndex] = bank.createDebitAccount(this.name);
            accountIndex++;
        } else {
                System.out.println("Congratulations " + this.name + ", your credit card is ready to be used");
                creditAccounts[accountIndex] = bank.createCreditAccount(this.name);
                accountIndex++;
        }
    }

    public Account getDebitAccounts(int accountIndex) {
        return debitAccounts[accountIndex];
    }
    public Account getCreditAccounts(int accountIndex) {
        return creditAccounts[accountIndex];
    }


}
