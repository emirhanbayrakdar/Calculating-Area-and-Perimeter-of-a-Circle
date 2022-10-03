import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        int radius;
        radius = scanner.nextInt();

        System.out.print("Merkez açısının ölçüsünü giriniz : ");
        double alfa;
        alfa = scanner.nextDouble();

        double pi = 3.14;
        double cevre = radius * radius * pi;
        System.out.println("Üçgenin çevresi : " + cevre);
        double alan = (pi * (radius * radius) * alfa);
        System.out.println("Üçgenin alanı : " + alfa);
    }
}