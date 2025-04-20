/*Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Kilo (kg) / Boy(m) * Boy(m)
 */
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        float weight, height, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight as kilogram");
        weight= scanner.nextFloat();
        System.out.println("Please enter your height as meter");
        height= scanner.nextFloat();
        bmi=weight/(height*height);
        System.out.println("Your BMI is "+bmi);
    }
}
