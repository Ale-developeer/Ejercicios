import java.util.Scanner;

public class Edad extends Main {
    public static int edad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese edad: ");
        return Integer.parseInt(scanner.nextLine());
    }
}