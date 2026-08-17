import java.util.Scanner;

class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;   // just sets balance, no print now
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class ATM extends Account {
    int pin;

    ATM(double balance, int pin) {
        super(balance);
        this.pin = pin;
        System.out.println("Welcome to the ATM!");   // new welcome message
    }

    boolean verifyPin(int enteredPin) {
        return enteredPin == pin;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM myAtm = new ATM(500000, 1234);

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (!myAtm.verifyPin(enteredPin)) {
            System.out.println("Incorrect PIN. Access denied.");
            return;
        }

        System.out.println("PIN verified. Access granted.");
        int choice;

        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    myAtm.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    myAtm.withdraw(wd);
                    break;
                case 3:
                    myAtm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }
}


Output:-
Welcome to the ATM!
Enter PIN: 1234
PIN verified. Access granted.

1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Choose an option: 1
Enter amount to deposit: 123456
Deposited: $123456.0

1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Choose an option: 3
Current Balance: $623456.0

1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Choose an option: 4
Thank you for using the ATM!
