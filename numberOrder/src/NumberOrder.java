import java.util.Scanner;

/*Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.*/
public class NumberOrder {
    public static void main(String[] args) {
        int num1,num2,num3;
        int first,second,third;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter first number");
        num1= scanner.nextInt();
        System.out.println("Please enter second number");
        num2=scanner.nextInt();
        System.out.println("Please enter third number");
        num3=scanner.nextInt();
        if(num1>num2){
            if(num1>num3){
                first=num1;
                if(num3>num2){
                    second=num3;
                    third=num2;
                }
                else{
                    second=num2;
                    third=num3;
                }
            }
            else{
                first=num3;
                second=num1;
                third=num2;
            }
        }
        else{
            if(num2>num3){
                first=num2;
                if(num3>num1){
                    second=num3;
                    third=num1;
                }
                else{
                    second=num1;
                    third=num3;
                }

            }
            else{
                first=num3;
                second=num2;
                third=num1;
            }
        }
        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
    }
}
