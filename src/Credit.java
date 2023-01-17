public class Credit extends Account {


    public Credit(String name, Bank bank){
        super (name, bank);
    }

    @Override
    public void withDrawMoney(int withDrawValue) {
        System.out.println("You can't withdraw money from your credit account");
    }

    @Override
    public void pay(int paymentValue) {
        if(balance < 0) {
            int fee = 5;
            balance -= (paymentValue + fee);
            System.out.println("Payment completed, your credit account balance is: " + getBalance() + "€");
        } else if (balance < -100) {
            System.out.println("Your account balance is less than -100€, you can't pay.");
        } else{
            balance -= paymentValue;
            System.out.println("Payment completed, your credit account balance is: " + getBalance() + "€");
        }

    }

    @Override
    public void depositMoney(int value){
        balance += value;
        System.out.println("Deposit completed on credit account, your credit account balance is: " + getBalance() + "€");
    }

}
