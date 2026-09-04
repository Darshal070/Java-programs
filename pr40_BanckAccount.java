import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class pr40_BanckAccount {
    int balance = 50000;

    void withdraw(int amount) throws InsufficientBalanceException {
        if (balance > amount) {
            balance = balance - amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            throw new InsufficientBalanceException("Balance is less than amount!");
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pr40_BanckAccount account = new pr40_BanckAccount();

        System.out.print("Enter withdrawal amount: ");
        int amt = sc.nextInt();

        try {
            account.withdraw(amt);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}