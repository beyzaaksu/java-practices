/*Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi*/
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum=0;
        for(int i=0; i<numbers.length;i++){
            sum=sum+(1.0/numbers[i]);
        }
        double harmonicMean=numbers.length/sum;
        System.out.println(harmonicMean);
    }
}
