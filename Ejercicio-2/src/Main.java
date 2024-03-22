import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Main {
    public static void main(String[] args) {

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
                break;

            }
            System.out.println("Datos");
            for (Empleados empleados : banco.getEmpleados()){
                System.out.println(empleados.getNombre()+" "+empleados.getApellido());

            }
            break;

        }

    }

}