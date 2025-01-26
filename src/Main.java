import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Druga zadaca");
        System.out.println("\t1. Napisati program koji ce na kraju ispisati rezultat. (oblikovati tekst ispisa kao 'Zbroj broja 4 + 2 = 6'.");
        int a = 4;
        int b = 2;
        System.out.println("\t\tZbroj brojeva " + a + " + " + b + " = " + (a + b) + "\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\t2. Napisati program koji ce u prvom redu ispisati ime i prezime, nakon toga ostaviti prazan red i u trecem redu naziv mjesta u kojem zivim.");
        System.out.print("\t\tUnesi svoje ime: ");
        String ime = scanner.nextLine();
        System.out.print("\t\tUnesi svoje prezime: ");
        String prezime = scanner.nextLine();
        System.out.print("\t\tUnesi ime mjesta u kojem živiš: ");
        String mjesto = scanner.nextLine();
        System.out.print("\t\t\tIme i prezime: " + ime + " " + prezime + "\n\n");
        System.out.println("\t\t\tMjesto u kojem živiš: " + mjesto + "\n");

        System.out.println("\t3. Napisati program koji ce izracunati duljinu hipotenuze pravokutnog trokuta.");
        System.out.print("\t\tUnesi duljinu katete a u milimetrima: ");
        double katetaA = scanner.nextDouble();
        System.out.print("\t\tUnesi duljinu katete b u milimetrima: ");
        double katetaB = scanner.nextDouble();
        double hipotenuzaC = Math.sqrt(Math.pow(katetaA, 2) + Math.pow(katetaB, 2));
        System.out.print("\t\t\tPrema Pitagorinuom poucku, hipotenuza trokuta s unesenim katetama je : " + Math.round(hipotenuzaC*100)/100d + " mm.\n");
    }
}