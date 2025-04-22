/*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/
import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
      int math , physics,turkish,chem,music,total=0,count=0;
      int min=55;
      double average;

      Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your math score");
        math=scanner.nextInt();
        System.out.println("Please enter your physics score");
        physics=scanner.nextInt();
        System.out.println("Please enter your Turkish score");
        turkish= scanner.nextInt();
        System.out.println("Please enter your chem score");
        chem=scanner.nextInt();
        System.out.println("Please enter your music score");
        music=scanner.nextInt();
      if(math>=0 && math<=100){
          total=total+math;
          count+=1;
        }
      if(physics>=0 && physics<=100){
          total=total+physics;
          count+=1;
        }
      if(turkish>=0 && turkish<=100){
          total=total+turkish;
          count+=1;
        }
      if(chem>=0 && chem<=100){
          total=total+chem;
          count+=1;
        }
      if(music>=0 && music<=100){
          total=total+music;
          count+=1;
        }
      average=total/(double)count;
      if(average>=min){
          System.out.println("Your score is "+average+" You passed'");
      }
      else{
          System.out.println("Your score is "+average+" Failed");
      }

    }
}
