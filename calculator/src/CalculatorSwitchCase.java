import java.util.Scanner;
public class CalculatorSwitchCase {
    public static void main(String[] args) {
        int operator, numberOne, numberTwo,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number");
        numberOne=scanner.nextInt();
        System.out.println("Please enter your second number");
        numberTwo=scanner.nextInt();
        System.out.println("Please enter your operator. \n1 for Addition\n2 for Substraction\n3 for Multiplication\n4 for Division");
        operator=scanner.nextInt();
        switch (operator){
            case 1:
               result=numberOne+numberTwo;
                System.out.println("Your result is "+result);
                break;
            case 2:
                result=numberOne-numberTwo;
                System.out.println("Your result is "+result);
                break;
            case 3:
                result=numberOne*numberTwo;
                System.out.println("Your result is "+result);
                break;
            case 4:
                result=numberOne/numberTwo;
                System.out.println("Your result is "+result);
                break;
            default:
                System.out.println("Wrong value!");
        }
    }
}
