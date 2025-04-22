/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız*/
import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String userName;
        String password;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please enter your userName");
        userName=scanner.nextLine();
        System.out.println("Please enter your password");
        password=scanner.nextLine();
        if(userName.equals("User") && password.equals("password123")){
            System.out.println("Welcome!");
        }
        else{
            int answer;
            System.out.println("Wrong! Do you wanna reset your password? For yes press 1, for no press 0");
            answer=scanner.nextInt();
            scanner.nextLine(); //intten sonra enter tuşunu next line olarak yakalamaması için
            if(answer==1){
                String newPassword;
                System.out.println("Please enter your new password");
                newPassword=scanner.nextLine();
                if(!newPassword.equals("password123")){
                    password=newPassword;
                    System.out.println("Password has changed");
                }
                else{
                    System.out.println("Your new password cannot be same as your old one");
                }
            }
            else{
                System.out.println("Bye Bye");
            }

        }

    }
}
