public class TestAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(88, "Tan Ah Teck", 'm');

        System.out.println(customer);
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer name: " + customer.getName());
        System.out.println("Customer gender: " + customer.getGender());

        Account account = new Account(101, customer, 88.88);
        System.out.println(account);
        System.out.println("Account ID: " + account.getId());
        System.out.println("Customer: " + account.getCustomer());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Customer name: " + account.getCustomerName());

        account.setBalance(100.00);
        account.deposit(20.00);
        account.withdraw(30.00);
        System.out.println(account);

        account.withdraw(500.00);

        Account secondAccount = new Account(102, customer);
        System.out.println(secondAccount);
    }
}