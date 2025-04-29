import java.util.Scanner;

/*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan
ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
Bir sayının kendisi hariç pozitif tam sayı çarpanları
(kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.*/
public class PerfectNumber {
    public static void main(String[] args) {
        int number,total=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your number");
        number= scanner.nextInt();

        for(int i=1; i<number; i++){
            if(number%i==0){
                total=total+i;
            }
        }
        if(total==number){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
    }
}
