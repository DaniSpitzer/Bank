public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Daniela");
        Customer customer2 = new Customer("Sara");

        Bank santander = new Bank("Santander");
        Bank ctt = new Bank("ctt");
        Bank millennium = new Bank("Millennium");

        System.out.println(customer1.getName() + " creates a debit account at " + santander.getBankName());
        customer1.askCard(true, santander);
        customer1.getDebitAccounts(0).depositMoney(100);
        System.out.println(customer1.getName() + " creates a credit account at " + ctt.getBankName());
        customer1.askCard(false, ctt);
        customer1.getCreditAccounts(0).depositMoney(200);
        customer1.getCreditAccounts(0).pay(50);

        System.out.println("\n_____\n");

        customer2.askCard(true, millennium);
        customer2.getDebitAccounts(0).depositMoney(500);
        customer2.askCard(false,millennium);
        customer2.getCreditAccounts(0).depositMoney(200);
        customer2.getDebitAccounts(0).withDrawMoney(30);


    }
}