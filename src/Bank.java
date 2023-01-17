public class Bank {

    private String bankName;

    public Bank(String name) {
        this.bankName = name;
    }

    public String getBankName() {
        return bankName;
    }

    public Debit createDebitAccount(String customerName){
        Debit d1 = new Debit(customerName, this);
        return d1;
    }

    public Credit createCreditAccount(String customerName){
        Credit c1 = new Credit(customerName, this);
        return c1;
    }


}
