//Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.
public class Main {
    public static void main(String[] args) {
        String [][] letter = new String[6][5];
        for(int i=0 ; i< letter.length; i++){
            for(int j=0; j<letter[i].length; j++){
               if(i==0 || i==2 || i==5){
                   letter[i][j]="*";
               }
               else if(j==0 || j==4){
                   letter[i][j]="*";
               }
               else{
                   letter[i][j]=" ";
               }
            }
        }
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
