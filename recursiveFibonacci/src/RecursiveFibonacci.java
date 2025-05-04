import java.util.Scanner;

public class RecursiveFibonacci {
    static int fibonacci(int number){
            if(number==1 || number==2){
               return 1;
            }
    return(fibonacci(number-1)+fibonacci(number-2));

    }
    public static void main(String[] args) {
       int number;
       Scanner scanner=new Scanner(System.in);
       System.out.println("Please enter your number");
       number= scanner.nextInt();
       System.out.println("Your result is "+fibonacci(number));
    }
}
