import java.util.Scanner;

/*Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.*/
public class ReverseTriangle {
    public static void main(String[] args) {
        int number;
        Scanner scanner= new Scanner(System.in);
        number= scanner.nextInt();

        for(int i=0; i<number; i++){
           for(int k=1; k<2*(number-i); k++){
               System.out.print("*");
           }
            System.out.println(" ");
        }
    }
}
