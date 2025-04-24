/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
 Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
 Mesafe başına ücret 0,10 TL / km olarak alın.
 İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
import java.util.Scanner;
public class PlaneTicket {
    public static void main(String[] args) {
        double distance,total, discountedTotal, perDistance=0.10;
        int age,type;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your distance");
        distance=scanner.nextDouble();
        System.out.println("Please enter your age");
        age=scanner.nextInt();
        System.out.println("Please enter your travel type 1 for one way, 2 for round");
        type= scanner.nextInt();;
        if(type==1 && distance>0 && age>0){
            total=distance*perDistance;
            if(age<12){
                discountedTotal=total-(total*50/100);
                System.out.println("Your total is "+discountedTotal);
            } else if (age>=12 && age<24) {
                discountedTotal=total-(total*10/100);
                System.out.println("Your total is "+discountedTotal);
            }
            else if(age>65){
                discountedTotal=total-(total*30/100);
                System.out.println("Your total is "+discountedTotal);
            }
            else {
                System.out.println("Your total is "+total);
            }
        }
        else if(type==2 && distance>0 && age>0) {
            total=distance*perDistance*2;
            total=total-(total*20/100);
            if(age<12){
                discountedTotal=total-(total*50/100);
                System.out.println("Your total is "+discountedTotal);
            } else if (age>=12 && age<24) {
                discountedTotal=total-(total*10/100);
                System.out.println("Your total is "+discountedTotal);
            }
            else if(age>65){
                discountedTotal=total-(total*30/100);
                System.out.println("Your total is "+discountedTotal);
            }
            else {
                System.out.println("Your total is "+total);
            }
        }
        else {
            System.out.println("Wrong data entry");
        }
    }
}
