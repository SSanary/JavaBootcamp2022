package Java.Odev1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat = 0, fizik = 0, kimya = 0, turkce = 0, tarih = 0, muzik = 0;
        int ortalama = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz lütfen: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz lütfen: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz lütfen: ");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz lütfen: ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz lütfen: ");
        tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz lütfen: ");
        muzik = input.nextInt();

        ortalama = mat + fizik + kimya + turkce + tarih + muzik;
        ortalama /= 6;

        System.out.println(ortalama >= 60 ? "Tebrikler Sınıfı Geçtiniz!":"Üzgünüz Sınıfta Kaldınız!");
    }
}
