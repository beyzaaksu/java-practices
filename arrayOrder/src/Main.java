import java.util.Arrays;
import java.util.Scanner;

//Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
// Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
public class Main {
    public static void main(String[] args) {
      int length;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter your arrays length");
      length=scanner.nextInt();
      int array[]=new int[length];
      for(int i=0; i<array.length;i++){
          System.out.println("Please enter your "+(i+1)+". array element");
          array[i]=scanner.nextInt();
      }
      System.out.println("Your Array: "+Arrays.toString(array));

      for(int j=0;j<array.length;j++){
          int hold;
          for(int k=j+1;k<array.length;k++){
              if(array[k]<array[j]){
                  hold=array[j];
                  array[j]=array[k];
                  array[k]=hold;

              }
          }
      }
        System.out.println("Your Ordered Array: "+Arrays.toString(array));

    }
}
