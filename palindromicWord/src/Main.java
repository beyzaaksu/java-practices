import java.util.Scanner;

/*Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazınız.
Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".*/
public class Main {
    public static void main(String[] args) {
        String word;
        System.out.println("Please enter a word");
        Scanner scanner= new Scanner(System.in);
        word= scanner.nextLine();
        int n=word.length()-1;
        String reverse="";
        for(int i=0; i<word.length(); i++){
            reverse=reverse+word.charAt(n);
            n--;
        }
        if(reverse.equalsIgnoreCase(word)){
            System.out.println(word+" is a Palindromic word!");
        }
        else{
            System.out.println(word+" is not a Palindromic word!");
        }
        }
    }

