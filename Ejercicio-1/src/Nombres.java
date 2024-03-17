import java.util.Scanner;

public class Nombres extends Main {
    public static String nombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese nombre: ");
        return scanner.nextLine();
    }
}
