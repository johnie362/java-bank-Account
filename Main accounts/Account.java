
public class Account {
    private String number;
    private double balance;
    private String CustomerName;
    private String CustomerEmailAddress;
    private String CustomerPhoneNumber;

public Account (String number, double balance, String CustomerName, String CustomerEmailAddress, String CustomerPhoneNumber ){
    this.number = number;
    this.balance = balance;
    this.CustomerName = CustomerName;
    this.CustomerEmailAddress= CustomerEmailAddress;
    this.CustomerPhoneNumber= CustomerPhoneNumber;
}
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("deposit of " + depositAmount + "made.New balance is" + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount <= 0) {
            System.out.println("only" + this.balance + "available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal of " + withdrawalAmount + "processed. Remaining balance = " + this.balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return CustomerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        CustomerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        CustomerPhoneNumber = customerPhoneNumber;
    } }