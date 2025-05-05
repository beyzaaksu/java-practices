import java.util.Scanner;

/*Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
 "Recursive" metot kullanarak yapan programı yazınız.*/
public class RecursiveExponential {
    static int recursiveExp(int base, int power){
        if(power==0){
            return 1;
        }
        else{
            return base*recursiveExp(base,power-1);
        }

    }
    public static void main(String[] args) {
        int base, power;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your base");
        base= scanner.nextInt();;
        System.out.println("Please enter your power");
        power= scanner.nextInt();
        System.out.println("Your result is : "+ recursiveExp(base,power));
    }
}
