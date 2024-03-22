import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private String nombre;
    private int num_sucursal;
    private String direccion;
    private int telefono;
private List<Empleados> empleados;
private List<Cliente> clientes;
    public Banco(String nombre, int num_sucursal, String direccion, int telefono) {
        this.nombre=nombre;
        this.num_sucursal=num_sucursal;
        this.direccion=direccion;
        this.telefono=telefono;
        this.empleados= new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
    public void agregarEmpleado(Empleados empleado){
        empleados.add(empleado);
    }

    public List<Empleados> getEmpleados() {
        return empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_sucursal() {
        return num_sucursal;
    }

    public void setNum_sucursal(int num_sucursal) {
        this.num_sucursal = num_sucursal;
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


    public static String nombre_b(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de Banco: ");
        return scanner.nextLine();
    }
    public static int num_sucursal(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nª sucursal: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public static String direccion_b(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Direccion: ");
        return scanner.nextLine();
    }
    public static int telefono(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Telefono: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
