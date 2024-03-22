import java.util.Scanner;

public class Empleados {
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String direccion;
    private int telefono;
    private int legajo;

    public Empleados(String nombre, String apellido, int edad, String sexo, String direccion, int telefono, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public static String nombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nombre: ");
        return scanner.nextLine();
    }
    public static String apellido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Apellido: ");
        return scanner.nextLine();
    }
    public static int edad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Edad: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public static String sexo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sexo: ");
        return scanner.nextLine();
    }
    public static String direccion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Direccion: ");
        return scanner.nextLine();
    }
    public static int telefono() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Telefono: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public static int legajo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Legajo: ");
        return Integer.parseInt(scanner.nextLine());
    }
}