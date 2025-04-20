/*Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
* Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.*/
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class HipotenusCalculate {
    public static void main(String[] args) {
      int edge1,edge2;
      double hipotenus;
      double area;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter triangle's first edge");
      edge1= scanner.nextInt();
      System.out.println("Please enter triangle's second edge");
      edge2=scanner.nextInt();
      hipotenus=sqrt((Math.pow(edge1,2)+Math.pow(edge2,2)));
      area=edge1*edge2/2.0;
        System.out.println("Your triangle's area is "+area+" and hipotenus is "+hipotenus);
    }
}
