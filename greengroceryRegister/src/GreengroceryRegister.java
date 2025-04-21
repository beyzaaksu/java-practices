/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/
import java.util.Scanner;
public class GreengroceryRegister {
    public static void main(String[] args) {
        double total, pear, apple,tomato,banana,eggplant;
        double pearPrice=2.14;
        double applePrice=3.67;
        double tomatoPrice=1.11;
        double bananaPrice=0.95;
        double eggplantPrice=5.00;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter how many kilograms pear you buy? ");
        pear= scanner.nextDouble();
        System.out.println("Please enter how many kilograms apple you buy? ");
        apple= scanner.nextDouble();
        System.out.println("Please enter how many kilograms tomato you buy? ");
        tomato=scanner.nextDouble();
        System.out.println("Please enter how  many kilograms banana you buy? ");
        banana=scanner.nextDouble();
        System.out.println("Please enter how many kilograms eggplant you buy? ");
        eggplant=scanner.nextDouble();
        total=(pear*pearPrice)+(apple*applePrice)+(tomato*tomatoPrice)+(banana*bananaPrice)+(eggplant*eggplantPrice);
        System.out.println("Your total is "+total);
    }
}
