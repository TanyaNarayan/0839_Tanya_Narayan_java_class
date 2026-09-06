// package assignment_7;

//  class bank_management {
//     String acc_num;
//     String acc_holder_name;

//     void verify_acc_num(){
//          if(acc_num.isEmpty()){
//             System.out.println("account number is empty");
//         }
//        else if(acc_num.length()<5){
//             System.out.println("enter valid account number of atleast 5 characterA");
//         }
//         else{
//             System.out.println("account number is " + acc_num);
//         }

//     }
//     void verify_acc_holder_name(){
//         if(acc_holder_name.isEmpty()){
//             System.out.println("enter name ");
//         }
//         else if(acc_holder_name.length()<3){
//             System.out.println("enter holder name of more than 3 character");
//         }
//         else{
//             System.out.println("account holder name is " + acc_holder_name);
//         }
//     }

    
//     public static void main(String[] args) {
//         bank_management b1 = new bank_management();

//         b1.acc_num = "1234";
//         b1.acc_holder_name = "Rahul";

//         b1.verify_acc_num();
//         b1.verify_acc_holder_name();
        
//     }
    
// }
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        setAccountNumber(accountNumber);
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.isEmpty()
                && accountNumber.length() >= 5) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid Account Number");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.isEmpty()
                && accountHolderName.length() >= 3) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Invalid Account Holder Name");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Depositing: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Available Balance: " + balance);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(
            "ACC1001",
            "Rahul Sharma",
            5000.0
        );

        account.displayAccountDetails();

        account.deposit(2000);

        account.withdraw(3000);

        System.out.println("Updated Balance: " + account.getBalance());
    }
}