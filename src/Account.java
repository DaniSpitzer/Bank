public abstract class Account {

    protected int balance;
    private static boolean isAccountActive;
    private String customerName;
    protected Bank bank;


    public Account(String customerName, Bank bank) {
        this.customerName = customerName;
        this.bank = bank;
    }
    public abstract void withDrawMoney(int withDrawValue);
    public abstract void depositMoney(int depositValue);

    public abstract void pay(int paymentValue);

    public int getBalance() {
        return balance;
    }
}
