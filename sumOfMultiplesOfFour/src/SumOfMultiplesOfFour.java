import java.util.Scanner;

/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
public class SumOfMultiplesOfFour {
    public static void main(String[] args) {
        int number=0,sum=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your numbers");
        while(number%2!=1){
            number= scanner.nextInt();
            if(number%2==0 && number%4==0){
                sum=sum+number;
            }

        }
        System.out.println(sum);
    }
}
