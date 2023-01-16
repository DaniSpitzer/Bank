public abstract class Account {

    protected int balance;
    private static boolean isAccountActive;
    private String customerName;

    public Account(String customerName) {
        this.customerName = customerName;
    }
    public static void activeAccount(){
        isAccountActive = true;
    }

    public abstract void withDrawMoney(int withDrawValue);
    public abstract void depositMoney(int depositValue);

    public abstract void pay(int paymentValue);
    public String getCustomerName() {
        return customerName;
    }

    public int getBalance() {
        return balance;
    }
}
