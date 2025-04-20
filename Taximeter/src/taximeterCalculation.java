/*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/
import java.util.Scanner;
public class taximeterCalculation {
    public static void main(String[] args) {
        float distance,cost;
        float taximeter=2.20f;
        int minimumCost=20;
        int start=10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your distance");
        distance=scanner.nextFloat();
        cost=start+(distance*taximeter);
        String message= (cost>20) ? ("Your total is "+cost+" TL") : ("Your total is "+minimumCost+" TL");
        System.out.println(message);
    }
}
