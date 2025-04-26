import java.util.Scanner;

/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/
public class DivisionThreeAndFour {
    public static void main(String[] args) {
        int number, sum = 0, count = 0;
        double avr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                sum = sum + i;
                count++;
            }
        }
        if (count>0) {
            avr = (double)sum/count;
            System.out.println("Your average is " + avr);
        }
        else {
            System.out.println("No numbers divisible by both 3 and 4 found.");
        }
    }
}
