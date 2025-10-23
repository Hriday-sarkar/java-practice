import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        float current_balance = 7000;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome, Customer! Choose Your Desired Operation:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.print("Enter Your Choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your current balance is: ₹" + current_balance);
                break;

            case 2:
                System.out.print("Enter the amount to withdraw: ");
                float withdraw = sc.nextFloat();
                if (withdraw > current_balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    current_balance -= withdraw;
                    System.out.println("Withdrawal successful! New balance: ₹" + current_balance);
                }
                break;

            case 3:
                System.out.print("Enter the amount to deposit: ");
                float deposit = sc.nextFloat();
                current_balance += deposit;
                System.out.println("Deposit successful! New balance: ₹" + current_balance);
                break;

            case 4:
                System.out.println("Thank you for using our ATM. You are exited.");
                break;

            default:
                System.out.println("Invalid choice! Please select between 1 and 4.");
        }

        sc.close();
    }
}
