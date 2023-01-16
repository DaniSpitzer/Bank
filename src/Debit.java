public class Debit extends Account {

    int debitAccountBalance;

    public Debit(String name){
        super (name);
    }

    @Override
    public void withDrawMoney(int withDrawValue) {
        balance -= withDrawValue;
    }

    @Override
    public void pay(int paymentValue) {
        if(balance < -100){
            System.out.println("Your bank balance is less than -100€, you can't pay with your debit card.");
        }
        balance -= paymentValue;
    }

    @Override
    public void depositMoney(int value){
        balance += value;
    }

}
