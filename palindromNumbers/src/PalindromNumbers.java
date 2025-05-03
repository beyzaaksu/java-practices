import java.util.Scanner;

/*Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.*/
public class PalindromNumbers {
    static boolean isPalindrom(int number){
        int temp=number, reversedNumber=0, digit;
        boolean isPalindrom;
        while(temp>0){
            digit=temp%10;
            reversedNumber=(reversedNumber*10)+digit;
            temp=temp/10;
        }
        if(number==reversedNumber){
            isPalindrom=true;
        }
        else{
            isPalindrom=false;
        }
        return isPalindrom;
    }
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your number");
        number=scanner.nextInt();
        if(isPalindrom(number)){
            System.out.println("It is a palindrom number");
        }
        else {
            System.out.println("It is not a palindrom number");
        }
    }
}
