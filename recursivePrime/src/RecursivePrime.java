import java.util.Scanner;

/*Java dilinde "Recursive" metot kullanarak,
 kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.*/
public class RecursivePrime {
    static int recursivePrime(int number,int divider){
        if(divider==1 || number==2){
            System.out.println(number+" is a Prime number");
            return 0;
        }
        if(number==1){
            System.out.println(number+" is not a prime number");
            return 0;
        }
       if(number%divider==0){
           System.out.println(number+" is not a prime number");
           return 0;
       }
       return recursivePrime(number, divider-1);
       
    }
    public static void main(String[] args) {
        int number;
        System.out.println("Please enter a number");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        int divider=number/2;
        recursivePrime(number,divider);
    }
}
