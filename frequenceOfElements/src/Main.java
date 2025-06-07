//Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
public class Main {
    public static void main(String[] args) {
       int[] array ={10, 20, 20, 10, 10, 20, 5, 20};
       boolean[] counted= new boolean[array.length];

        for(int i=0; i< array.length;i++){
           if(!counted[i]) {
               int repeat = 1;
               for (int j = i + 1; j < array.length; j++) {
                   if (array[i] == array[j] && !counted[j]) {
                       repeat++;
                       counted[j] = true;
                   }
               }
               System.out.println(array[i]+" number "+repeat+" times repeated");
               counted[i]=true;
           }
       }
    }
}
