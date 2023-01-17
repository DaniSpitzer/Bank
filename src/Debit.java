public class Debit extends Account {


    public Debit(String name, Bank bank){
        super (name, bank);
    }
    @Override
    public void withDrawMoney(int withDrawValue) {
        balance -= withDrawValue;
        System.out.println("Take your money, your debit account balance is: " + getBalance() + "€");
    }
    @Override
    public void pay(int paymentValue) {
        if(balance < 0){
            System.out.println("Your bank balance is negative, you can't pay with your debit card.");
        }
        balance -= paymentValue;
        System.out.println("Payment completed, your debit account balance is: " + getBalance() + "€");
    }
    @Override
    public void depositMoney(int value){
        balance += value;
        System.out.println("Deposit completed on debit account, your actual account balance is: " + getBalance() + "€");
    }

}
