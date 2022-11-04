package Java.Odev9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz: ");
        userName = input.next();
        System.out.println("Şifrenizi giriniz: ");
        password = input.next();

        if(userName.equals("patika") && password.equals("java123"))
            System.out.println("Giriş Yaptınız!");
        else
            System.out.println("Giriş yapılamadı bilgilerinizi yeniden giriniz");

    }
}
