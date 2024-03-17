import java.util.Scanner;

public class DNI extends Main {
    public static int dni() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese DNI: ");
        return Integer.parseInt(scanner.nextLine());
    }
}