package Java.Odev7;
import java.util.Scanner;
//Manav
//Armut : 2,14 TL
//Elma : 3,67 TL
//Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL
public class Main {
    public static void main(String[] args) {
        double tutar = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo?: ");
        tutar += 2.14 * (input.nextDouble());

        System.out.print("Elma Kaç Kilo?: ");
        tutar += 3.67 * (input.nextDouble());

        System.out.print("Domates Kaç Kilo?: ");
        tutar += 1.11 * (input.nextDouble());

        System.out.print("Muz Kaç Kilo?: ");
        tutar += 0.95 * (input.nextDouble());

        System.out.print("Patlıcan Kaç Kilo?: ");
        tutar += 5.0 * (input.nextDouble());

        System.out.print("Toplam tutar: " + tutar);
    }
}
