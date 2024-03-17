import java.util.Scanner;

public class Apellido extends Main {
    public static String apellido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese apellido: ");
        return scanner.nextLine();
    }
}