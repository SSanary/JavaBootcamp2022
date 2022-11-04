package Java.PratikHesapMakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1 = 0, sayi2 = 0, islem;
        Scanner input = new Scanner(System.in);
        System.out.print("Hesap makinesi programına hoş geldiniz.\nİşlem yapmak istediğiniz ilk sayıyı giriniz:");
        sayi1 = input.nextInt();
        System.out.print("İşlem yapmak istediğiniz ikinci sayıyı giriniz:");
        sayi2 = input.nextInt();

        System.out.println("Hangi işlemi yapmak istediğinizi seçiniz.\n" +
                            "1. Toplam\n2. Fark\n3. Çarpım\n4. Bölüm");
        islem = input.nextInt();
        switch (islem){
            case 1:
                System.out.println(sayi1 + " + " + sayi2 + " = "+" "+(sayi1 + sayi2)); break;
            case 2:
                System.out.println(sayi1 + " - " + sayi2 + " = "+" "+(sayi1 - sayi2)); break;
            case 3:
                System.out.println(sayi1 + " * " + sayi2 + " = "+" "+(sayi1 * sayi2)); break;
            case 4:
                System.out.println(sayi1 + " / " + sayi2 + " = "+" "+(sayi1 / sayi2)); break;
        }
    }
}
