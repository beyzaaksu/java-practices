import java.util.Scanner;

/*Bir sayının basamak sayılarının toplamını hesaplayan program yazınız*/
public class SumOfDigits {
    public static void main(String[] args) {
        int number,total=0,digitValue;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        number= scanner.nextInt();
       while(number>0){
           digitValue=number%10;
           number=number/10;
           total=total+digitValue;
       }
        System.out.println(total);

    }
}
