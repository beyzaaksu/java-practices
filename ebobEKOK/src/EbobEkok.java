import java.util.Scanner;

/*Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
* EKOK = (n1*n2) / EBOB */
public class EbobEkok {
    public static void main(String[] args) {
        int number1,number2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your first number");
        number1=scanner.nextInt();
        System.out.println("Please enter your second number");
        number2= scanner.nextInt();
        int number1_=number1;
        int number2_=number2;
        int i=2;
        int ebob=1;
        while(number1>=i && number2>=i){
            if(number1%i==0){
                if(number2%i==0){
                ebob=ebob*i;
                number1=number1/i;
                number2=number2/i;
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }
        }
        int ekok=number2_*number1_/ebob;
        System.out.println("EBOB: "+ebob+" EKOK: "+ekok);
    }
}
