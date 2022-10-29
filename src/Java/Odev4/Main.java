package Java.Odev4;

import java.util.Scanner;

//Taksimetre Programı
//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.

public class Main {
    public static void main(String[] args) {
        double odenecekTutar = 10, km = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kilometreyi Giriniz: ");
        km = input.nextDouble();

        odenecekTutar += km * 2.20;

        if(odenecekTutar < 20)
            odenecekTutar = 20;

        System.out.println("Odeyeceğiniz Tutar: " + odenecekTutar);
    }
}
