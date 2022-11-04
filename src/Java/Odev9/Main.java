package Java.Odev9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        String newPassword, newPassword2;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz: ");
        userName = input.next();
        System.out.println("Şifrenizi giriniz: ");
        password = input.next();

        if(userName.equals("patika") && password.equals("java123"))
            System.out.println("Giriş Yaptınız!");
        else{
            System.out.print("Kullanıcı adı veya parola hatalı. Parolanızı değiştirmek ister misiniz?(evet - hayır): ");
            String response = input.nextLine();

            if(response.equals("evet")) {

                System.out.print("Yeni şifre: ");
                newPassword = input.nextLine();
                System.out.print("Yeni şifrenizi tekrar giriniz: ");
                newPassword2 = input.nextLine();

                if(newPassword.equals(newPassword2)) {
                    System.out.println("Şifreniz Güncellendi!");
                }
                else {
                    System.out.println("Girdiğiniz Şifreler Farklı!");
                }
            }
            else {
                System.out.println("Mevcut şifrenizle yeniden giriş yapmayı deneyin.");
            }
        }
    }
}
