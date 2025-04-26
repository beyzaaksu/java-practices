/*Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun*/

import java.util.Scanner;

public class ChinaZodiac {
    public static void main(String[] args) {
        int birthYear;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your birth year");
        birthYear=scanner.nextInt();
        if(birthYear%12==0){
            System.out.println("You are a Monkey");
        }
        else if (birthYear%12==1) {
            System.out.println("You are a Rooster");
        }
        else if (birthYear%12==2) {
            System.out.println("You are a Dog");
        }
        else if (birthYear%12==3) {
            System.out.println("You are a Pig");
        }
        else if (birthYear%12==4) {
            System.out.println("You are a Rat");
        }
        else if (birthYear%12==5) {
            System.out.println("You are an Ox");
        }
        else if (birthYear%12==6) {
            System.out.println("You are a Tiger" );
        }
        else if (birthYear%12==7) {
            System.out.println("You are a Rabbit");
        }
        else if (birthYear%12==8) {
            System.out.println("You are a Dragon");
        }
        else if (birthYear%12==9) {
            System.out.println("You are a Snake");
        }
        else if (birthYear%12==10) {
            System.out.println("You are a Horse");
        }
        else if (birthYear%12==11) {
            System.out.println("You are a Goat");
        }
    }
}
