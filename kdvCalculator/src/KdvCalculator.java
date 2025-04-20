/*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

import java.util.Scanner;
public class KdvCalculator {
    public static void main(String[] args) {
        int cost;
        double costWithKdv;
        double totalKdv;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your cost");
        cost=scanner.nextInt();
        if(cost>1000){
            costWithKdv=cost+(cost*0.08);
        }
        else{
            costWithKdv=cost+(cost*0.18);
        }
        totalKdv=costWithKdv-cost;
        System.out.println("Your cost with tax is "+costWithKdv+ " And your tax total is "+totalKdv);
    }
}
