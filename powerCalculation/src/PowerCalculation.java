import java.util.Scanner;

/*Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.*/
public class PowerCalculation {
    public static void main(String[] args) {
        int base,power,result=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter base");
        base=scanner.nextInt();
        System.out.println("Please enter power");
        power=scanner.nextInt();
        for(int i=0; i<power; i++){
            result=result*base;
        }
        System.out.println(result);
    }
}
