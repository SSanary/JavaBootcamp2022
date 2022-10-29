package Java.Odev3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        double u = 0.0, alan = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("3 kenar için veri giriniz\n 1.kenar: ");
        a = input.nextInt();
        System.out.print("2.kenar: ");
        b = input.nextInt();
        System.out.print("3.kenar: ");
        c = input.nextInt();

        u = (a+b+c) / 2;

        alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));

        System.out.print("Girilen Üçgenin Alanı: " + alan);
    }
}
