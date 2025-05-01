import java.util.Scanner;

/*Java döngüler ile fibonacci serisi bulan program yazıyoruz.
Fibonacci serisinin eleman sayısını kullanıcıdan alın.
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.*/
public class FibonacciSeries {
    public static void main(String[] args) {
      int number,first=0, second=1;
      Scanner scanner=new Scanner(System.in);
      System.out.println("Please enter your number");
      number=scanner.nextInt();
      for(int i=0; i<=number;i++){
          System.out.print(first+",");
          int total=first+second;
          first=second;
          second=total;

      }

    }
}
