import java.util.Scanner;

/*
N elemanlı bir kümenin elemanları ile oluşturulacak
r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)*/
public class CombinationCalculate {
    public static void main(String[] args) {
        int n,r;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        n= scanner.nextInt();
        System.out.println("Please enter second number");
        r= scanner.nextInt();
        int factorialN=1;
        for(int i=1; i<=n; i++){
            factorialN=factorialN*i;
        }
        int factorialR=1;
        for(int i=1; i<=r; i++){
            factorialR=factorialR*i;
        }
        int factorialN_R=1;
        for (int i=1;i<=(n-r);i++){
            factorialN_R=factorialN_R*i;
        }
        result=(double)factorialN/(factorialR*factorialN_R);
        System.out.println("Result is "+result);
    }
}
