import java.util.Scanner;

public class Sexo extends Main {
    public static String sexo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese sexo: ");
        return scanner.nextLine();
    }
}