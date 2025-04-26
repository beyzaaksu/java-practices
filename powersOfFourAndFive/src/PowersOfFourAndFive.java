import java.util.Scanner;

/*java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/
public class PowersOfFourAndFive {
    public static void main(String[] args) {
        int number;
        int fivesPower=5;
        int foursPower=4;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        number=scanner.nextInt();
        for(int i=1; i<=number; i++){
            if(i%fivesPower==0){
                System.out.print(i +" ");
                fivesPower=fivesPower*5;
            }
            else if(i%foursPower==0){
                System.out.print(i+" ");
                foursPower=foursPower*4;
            }
        }
    }
}
