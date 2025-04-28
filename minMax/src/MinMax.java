import java.util.Scanner;

/*Java ile klavyeden girilen N tane sayma sayısından en büyük ve
 en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
 */
public class MinMax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
     int number;
     int n;
        System.out.println("How many numbers will you enter?");
        n=scanner.nextInt();
        System.out.println("Please enter your number");
        number= scanner.nextInt();
        int max=number;
        int min=number;
        n--;
        while(n>0){
            System.out.println("Please enter your number");
            number=scanner.nextInt();
            if(number>max){
                max=number;
            }
            else if(number<min){
                min=number;
            }
          n--;
        }
        System.out.println("Your max number is "+max+" Your min number is "+min);
    }
}
