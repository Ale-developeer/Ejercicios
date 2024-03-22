import java.util.Scanner;

public class Cliente extends Main{
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String direccion;
    private int telefono;
    private int num_cuenta;
    private int dinero;
    private int fecha_alta;
    private int fecha_baja;

    public Cliente(String nombre,String apellido,int edad,String sexo, String direccion,int telefono,int num_cuenta,int dinero,int fecha_alta,int fecha_baja){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.sexo=sexo;
        this.direccion=direccion;
        this.telefono=telefono;
        this.num_cuenta=num_cuenta;
        this.dinero=dinero;
        this.fecha_alta=fecha_alta;
        this.fecha_baja=fecha_baja;
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

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(int fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public int getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(int fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public static String nombre(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese nombre: ");
        return scanner.nextLine();
    }

}
