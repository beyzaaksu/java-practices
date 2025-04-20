/*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
 sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.*/
import java.util.Scanner;
public class GpaCalculate {
    public static void main(String[] args) {
        int math , physics, chem, turkish, history,music;
        double average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to GPA Calculator");
        System.out.println("Please enter your math score");
        math=scanner.nextInt();
        System.out.println("Please enter your physics score");
        physics=scanner.nextInt();
        System.out.println("Please enter your chem score");
        chem= scanner.nextInt();
        System.out.println("Please enter your Turkish score");
        turkish=scanner.nextInt();
        System.out.println("Please enter your history score");
        history=scanner.nextInt();
        System.out.println("Please enter your music score");
        music=scanner.nextInt();
        average=(math+physics+chem+turkish+history+music)/6.0;
        String result = (average>60) ? ("Your GPA is "+average+" You passed!"):("Your GPA is "+average+" You failed!");
        System.out.println(result);
    }
}
