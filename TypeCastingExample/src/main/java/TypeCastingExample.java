import java.util.Scanner;

public class TypeCastingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tam sayı alma
        System.out.print("Bir tam sayı giriniz: ");
        int intNumber = scanner.nextInt();

        // Kullanıcıdan ondalıklı sayı alma
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double doubleNumber = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürme (Widening Casting)
        double convertedToDouble = (double) intNumber;
        System.out.println("Tam sayıdan ondalıklı sayıya dönüştürülen: " + convertedToDouble);

        // Ondalıklı sayıyı tam sayıya dönüştürme (Narrowing Casting)
        int convertedToInt = (int) doubleNumber;
        System.out.println("Ondalıklı sayıdan tam sayıya dönüştürülen: " + convertedToInt);
    }
}
