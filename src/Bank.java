public class Bank {

    private String name;

    private Bank[] accounts;


    public Bank(String name) {
        this.name = name;
    }

    public static Debit createDebitAccount(String customerName){
        Debit d1 = new Debit(customerName);
        return d1;
    }

    public static Credit createCreditAccount(String customerName){
        Credit c1 = new Credit(customerName);
        return c1;
    }


}
