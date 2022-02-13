public class Main {
    public static void main(String[] args) {

        Account johnsAccount = new Account ( "123456789", 100, "FAITH JOHNS", "john962@gmail.com", "0721660063");
        System.out.println(johnsAccount.getNumber());
        System.out.println(johnsAccount.getBalance());
        System.out.println(johnsAccount.getCustomerName());
        System.out.println(johnsAccount.getCustomerEmailAddress());
        System.out.println(johnsAccount.getCustomerPhoneNumber());
        johnsAccount.withdrawal(1000);
        johnsAccount.deposit(2000);

        johnsAccount.withdrawal(100);
        johnsAccount.deposit(290);

         johnsAccount.deposit(7000);
         johnsAccount.withdrawal(2000);

    }
}