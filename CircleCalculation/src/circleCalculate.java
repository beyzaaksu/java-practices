/*Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360*/
import java.util.Scanner;
public class circleCalculate {
    public static void main(String[] args) {
        float pi=3.14f;
        float radius,area,perimeter,piece,angle;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your circle's radius");
        radius=scanner.nextFloat();
        area=pi*radius*radius;
        perimeter=2*pi*radius;
        System.out.println("Please enter angle");
        angle=scanner.nextFloat();
        piece=(pi*(radius*radius)*angle)/360;
        System.out.println("Your circle's area is "+area+" perimeter is "+perimeter+" and circle piece's area is "+piece);
    }
}







