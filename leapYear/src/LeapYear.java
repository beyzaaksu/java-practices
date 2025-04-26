import java.util.Scanner;

/*Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır
*/
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        year= scanner.nextInt();
        if(year%100!=0 && year%4==0){
            System.out.println("It is a leap year!");
        } else if (year%100==0 && year%400==0) {
            System.out.println("It is a leap year!");
        }
        else {
            System.out.println("It is not a leap year!");
        }
    }
}
