import java.util.Scanner;

/*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.*/
public class DesignMethod {
    static void design(int number) {
        System.out.print(number + " , ");
        if(number>0){
            design(number-5);
            System.out.print(number+" , ");;
        }
    }
    public static void main(String[] args) {
        int number;
        System.out.println("Please enter design number");
        Scanner scanner= new Scanner(System.in);
        number=scanner.nextInt();
        design(number);
    }
}
