import java.util.Scanner;

/*Java ile girilen sayının harmonik serisini bulan program*/
public class HarmonicSeries {
    public static void main(String[] args) {
        int number;
        double total=0.0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a number");
        number= scanner.nextInt();
        for(double i=1;i<=number;i++){
            total=total+(1/i);
        }
        System.out.println(total);

    }
}
