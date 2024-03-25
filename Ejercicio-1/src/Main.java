import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Personas> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){

            String nombre = Nombres.nombre();
            String apellido = Apellido.apellido();
            int edad = Edad.edad();
            int dni = DNI.dni();
            String sexo = Sexo.sexo();

        Personas persona = new Personas(nombre, apellido,edad, dni,sexo);
        personas.add(persona);

        System.out.println("¿ Desea ingresar otro dato? ");
        String respuesta= scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("si")){
                break;
            }
        }
        System.out.println("Consultas :");

        System.out.println("Consulta 1 : nombre y apellido de la persona con mayor edad y todas las de sexo femenino");
        Personas personaMayor=null;
        for(Personas person : personas){
            if (personaMayor == null||person.getEdad() > personaMayor.getEdad()){
                personaMayor = person;
            }
        }
        if (personaMayor != null){
            System.out.println("persona con edad mayor "+ personaMayor.getNombre()+" "+personaMayor.getApellido());
        }
        for (Personas person : personas){
            if (person.getSexo().equalsIgnoreCase("femenino")){
                System.out.println("personas con sexo Femenino: "+ person.getNombre()+" "+person.getApellido());
            }
        }

        System.out.println("Consulta 2 : nombre y apellido de las personas con el mismo apellido");
        for (Personas persona : personas){
            String apellidoActual=persona.getApellido();

            for (Personas otraPersona : personas){
                if (!personas.equals(otraPersona) && otraPersona.getApellido().equals(apellidoActual))
                    System.out.println(persona.getNombre() + " " + persona.getApellido());
            }

        }

        System.out.println("Consulta 3 \n Mostrar el DNI mayor ");
        Personas personaDniMayor = null;
        for (Personas persona : personas) {
            if (personaDniMayor == null || persona.getDni() > personaMayor.getDni()) {
                personaDniMayor = persona;
            }
        }
        if (personaDniMayor != null){
            System.out.println("Dni Mayor : " + personaDniMayor.getNombre() + " " + personaDniMayor.getApellido());

        }
        System.out.println("Consulta 4 \n Mostrar la lista completa ingresada");
        System.out.println("Lista Completa de Personas: ");
        for (Personas persona : personas){
            System.out.println("NOMBRES: "+ persona.getNombre());
            System.out.println("APELLIDOS: "+ persona.getApellido());
            System.out.println("EDAD: "+ persona.getEdad());
            System.out.println("DNI: "+ persona.getDni());
            System.out.println("SEXO: "+ persona.getSexo());

        }
    }
}

