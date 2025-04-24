/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart */
import java.util.Scanner;
public class ZodiacSign {
    public static void main(String[] args) {
        int day,month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your birth day");
        day= scanner.nextInt();
        System.out.println("Please enter your birth month");
        month=scanner.nextInt();
        if(month==1){
            if(day<22){
                System.out.println("You are a Capricorn");
            }
            else if(day>=22 && day<=31){
                System.out.println("You are an Aquarius");
            }
            else {
                System.out.println("Wrong date");
            }
        }
        else if(month==2){
            if(day<=19){
                System.out.println("You are an Aquarius");
            }
            else if (day>19 && day<=28) {
                System.out.println("You are a Pisces");
            }
            else {
                System.out.println("Wrong date");
            }
        }
        else if (month==3) {
            if(day<=20){
                System.out.println("You are a Pisces");
            }
            else if(day>20 && day<=31){
                System.out.println("You are an Aries ");
            }
            else {
                System.out.println("Wrong date");
            }
        }
        else if(month==4){
            if(day<=20){
                System.out.println("You are an Aries");
            }
            else if (day>20 && day<31) {
                System.out.println("You are a Taurus");
            }
            else {
                System.out.println("Wrong date");
            }
        }
        else if (month==5) {
            if(day<=21){
                System.out.println("You are a Taurus");
            }
            else if (day>21 && day<=31) {
                System.out.println("You are a Gemini");
            }
            else {
                System.out.println("Wrong date");
            }
        }
        else if (month==6) {
            if(day<=22){
                System.out.println("You are a Gemini");
            }
            else if(day>22 && day<31){
                System.out.println("You are a Cancer");
            }
            else {
                System.out.println("Wrong date");
            }
        }
        else if(month==7){
            if(day<=22){
                System.out.println("You are a Cancer");
            }
            else if (day>22 && day<=31) {
                System.out.println("You are a Leo");
            }
            else {
                System.out.println("Wrong date");
            }
        }
        else if (month==8) {
            if(day<=22){
                System.out.println("You are a Leo");
            }
            else if (day>22 && day<=31) {
                System.out.println("You are a Virgo");
            }
            else {
                System.out.println("Wrong date");
            }
        }
        else if (month==9) {
            if(day<=22){
                System.out.println("You are a Virgo");
            }
            else if (day>22 && day<31) {
                System.out.println("You are a Libra");
            }
            else {
                System.out.println("Wrong date");
            }
        }
        else if (month==10) {
            if(day<=22){
                System.out.println("You are a Libra");
            }
            else if (day>22 && day<=31) {
                System.out.println("You are a Scorpio");
            }
            else {
                System.out.println("Wrong date");
            }
        }
        else if (month==11){
            if(day<=21){
                System.out.println("You are a Scorpio");
            }
            else if (day>21 && day<31) {
                System.out.println("You are a Sagittarius");
            }
            else {
                System.out.println("Wrong date");
            }
        }
        else if (month==12) {
            if(day<=21){
                System.out.println("You are a Sagittarius");
            }
            else if (day>21 && day<=31) {
                System.out.println("You are a Capricorn");
            }
            else {
                System.out.println("Wrong date");
            }
        }
        else {
            System.out.println("Wrong date");
        }
    }
}
