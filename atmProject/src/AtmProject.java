import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Please enter your username:");
            userName = scanner.nextLine();
            System.out.print("Please enter your password");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, welcome to Kodluyoruz bank!");
                do {
                    System.out.println("1-Pay in\n" +
                            "2-Pay out\n" +
                            "3-Balance Inquiry\n" +
                            "4-Exit");
                    System.out.print("Please pick what you wanna do : ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Money Amount : ");
                            int price = scanner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Money Amount : ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient Balance.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Balance : " + balance);
                            break;
                    }
                }
                while(select!=4);{
                System.out.println("See you later");
                break;}
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account is blocked. Please contact with your bank.");
                } else {
                    System.out.println("Try : " + right);
                }
            }
        }
    }
}
