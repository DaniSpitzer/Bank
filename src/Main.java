public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Daniela");

        System.out.println(customer1.getName());

        customer1.askCard(true);
        customer1.getDebitAccount();
        customer1.getDebitAccount().depositMoney(100);
        System.out.println("Your debit account balance: " + customer1.getDebitAccount().balance);
        customer1.getDebitAccount().withDrawMoney(10);
        System.out.println("Your debit account balance: " + customer1.getDebitAccount().balance);
        customer1.getDebitAccount().pay(200);
        System.out.println("Your debit account balance: " + customer1.getDebitAccount().balance);
        customer1.getDebitAccount().pay(10);


    }
}