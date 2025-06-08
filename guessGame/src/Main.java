//Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı
// kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int guess;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isOutOfLine = false;

        while (right < 5) {
            System.out.print("Please enter your guess : ");
            guess = scanner.nextInt();

            if (guess < 0 || guess > 99) {
                System.out.println("Please enter a number between 0 and 100");
                if (isOutOfLine) {
                    right++;
                    System.out.println("You did a wrong guess. Remained rights : " + (5 - right));
                } else {
                    isOutOfLine = true;
                    System.out.println("Your next wrong guess will be decreased from your remained rights");
                }
                continue;
            }

            if (guess == number) {
                System.out.println("Congrats! You did a true guess. Secret number is: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("You enter a wrong number");
                if (guess > number) {
                    System.out.println(guess + " is bigger than secret number.");
                } else {
                    System.out.println(guess + " is smaller than secret number");
                }

                wrong[right++] = guess;
                System.out.println("Remained guess: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost! Secret number was: "+number);
            if (!isOutOfLine) {
                System.out.println("Your guesses: " + Arrays.toString(wrong)+ " Secret Number: "+number);
            }
        }

    }
}