import java.util.Arrays;

//Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program
public class Main {
    public static void main(String[] args) {
        int list[]={2,3,4,4,5,3,9,4,8,2,3,4,5,6,7,8,8};
        int duples[]=new int[list.length];
        int startIndex=0;
        for(int i=0; i<list.length;i++){
            for(int j=0;j< list.length;j++){
                if(i!=j && list[i]==list[j] && (list[i]%2==0)){
                    duples[startIndex]=list[i];
                    startIndex++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duples));
    }
}
