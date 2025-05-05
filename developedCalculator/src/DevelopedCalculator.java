import java.util.Scanner;
public class DevelopedCalculator {

    static void plus() {
        Scanner scanner = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers you will enter :");
        int counter = scanner.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scanner.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scanner = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scanner.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers you will enter? :");
        int counter = scanner.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scanner.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Divider can not be 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the base :");
        int base = scanner.nextInt();
        System.out.print("Please enter the power :");
        int exponent = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int n = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void mod(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter first number");
        int n= scanner.nextInt();
        System.out.println("Please enter second number");
        int k=scanner.nextInt();
        if(k==0){
            System.out.println("Divider can not be 0");
        }
        else{
        int result=n%k;
        System.out.println("Result : " + result);}
    }

    static void rectangleAreaPerimeter(){
        Scanner scanner= new Scanner(System.in);
        int longEdge,shortEdge,area,perimeter;
        System.out.println("Please enter long edge");
        longEdge=scanner.nextInt();
        System.out.println("Please enter short edge");
        shortEdge= scanner.nextInt();
        area=longEdge*shortEdge;
        perimeter=2*(longEdge+shortEdge);
        System.out.println("Area : " + area + " Perimeter : " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Substraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponential Number\n"
                + "6- Factorial\n"
                + "7- Mod \n"
                + "8- Rectangle Area and Perimeter \n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please choose an option :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleAreaPerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid value, please try again.");
            }
        } while (select != 0);


    }
}