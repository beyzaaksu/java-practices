import java.util.Scanner;
/*Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner*/
public class WhatToDo {
    public static void main(String[] args) {
        int temperature;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature");
        temperature=scanner.nextInt();
        if(temperature>25){
            System.out.println("You can swim");
        }
        else if(temperature<=25 && temperature>15){
            System.out.println("You can go to picnic");
        }
        else if(temperature<=15 && temperature>5){
            System.out.println("You can go to cinema");
        }
        else{
            System.out.println("You can go to skiing");
        }
    }
}
