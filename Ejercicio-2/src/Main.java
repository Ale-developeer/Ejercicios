import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String nombre = Banco.nombre_b();
            int sucursal = Banco.num_sucursal();
            String direccion = Banco.direccion_b();
            int telefono = Banco.telefono();

            Banco banco = new Banco(nombre,sucursal,direccion,telefono);

            while (true){
                String nombre_E = Empleados.nombre();
                String apellido_E = Empleados.apellido();
                int edad_E = Empleados.edad();
                String sexo_E = Empleados.sexo();
                String direccion_E = Empleados.direccion();
                int telefono_E = Empleados.telefono();
                int legajo = Empleados.legajo();

                Empleados empleados = new Empleados(nombre_E,apellido_E,edad_E,sexo_E, direccion_E,telefono_E,legajo);
                banco.agregarEmpleado(empleados);
                System.out.println("¿ Desea ingresar otro empleado? ");
                String respuesta= scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("si")){
                    break;
                }
            }
            while (true){
                String nombreC = Cliente.nombre();
                String apellidoC = Cliente.apellido();
                int edadC = Cliente.edad();
                String sexoC = Cliente.sexo();
                String direccionC = Cliente.direccion();
                int telefonoC = Cliente.telefono();
                int num_cuenta = Cliente.num_cuenta();
                int dinero = Cliente.dinero();
                int fechaAlta = Cliente.fecha_alta();
                int fechaBaja = Cliente.fecha_baja();

                Cliente cliente = new Cliente(nombreC,apellidoC,edadC,sexoC, direccionC,telefonoC,num_cuenta,dinero,fechaAlta,fechaBaja);
                banco.agregarCliente(cliente);
                System.out.println("¿ Desea ingresar otro Cliente? ");
                String respuesta= scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("si")){
                    break;
                }
            }

            System.out.println("¿ Desea ingresar otro Banco? ");
            String respuesta= scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("si")){
                break;
            }

        }
        System.out.println("Datos");
        for (Empleados empleado : banco.getEmpleados()){
            System.out.println(empleado.getNombre()+" "+empleado.getApellido());
        }
        scanner.close();

    }

}