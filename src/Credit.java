public class Credit extends Account {


    public Credit(String name){
        super (name);
    }

    @Override
    public void withDrawMoney(int withDrawValue) {
        System.out.println("You can't withdraw money from your credit account");
    }

    @Override
    public void pay(int paymentValue) {
        int fee = 5;
        balance -= (paymentValue + fee);
    }

    @Override
    public void depositMoney(int value){
        balance += value;
    }

}
