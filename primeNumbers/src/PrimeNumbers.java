/*Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.*/
public class PrimeNumbers {
    public static void main(String[] args) {
      int number=1;
      while(number<=100){
          boolean isPrime=true;
          for(int i=2; i<number;i++){
              if(number%i==0){
                  isPrime=false;
                  break;
              }
          }
          if(isPrime && number!=1){
              System.out.print(number+",");
          }
          number++;
      }
    }
}
