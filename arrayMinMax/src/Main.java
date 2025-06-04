import java.util.Scanner;

//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int min=list[0];
        int max=list[0];
        System.out.println("Please enter a number");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        //girilen sayıdan küçük en büyük dizi elemanı
        for(int i=0; i<list.length; i++){
          if(min<number){
              if(list[i]>min && list[i]<number){
                  min=list[i];
              }
          }
          else{
              if(list[i]<number){
                  min=list[i];
                  if((i+1)< list.length && list[i+1]>list[i] && list[i+1]<number ){
                      min=list[i+1];
                  }
              }
          }
        }
        //girilen sayıdan büyük en küçük dizi elemanı
        for(int i=0; i<list.length; i++){
            if(max>number){
                if(list[i]<max && list[i]>number){
                    max=list[i];
                }
            }
            else{
                if(list[i]>number){
                    max=list[i];
                    if(i+1<list.length && list[i+1]<list[i] && list[i+1]>number){
                        max=list[i+1];
                    }
                }
            }
        }
        System.out.println("Min: "+min+" Max: "+max);


    }
}
