import java.util.Arrays;

//Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,7},{5,6,4}};
        int[][] transpose=new int[matrix[0].length][matrix.length];
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length; j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
