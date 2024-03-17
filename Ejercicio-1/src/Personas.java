public class Personas {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String sexo;

            public Personas(String nombre,String apellido,int edad,int dni,String sexo){
                this.nombre=nombre;
                this.apellido=apellido;
                this.edad=edad;
                this.dni=dni;
                this.sexo=sexo;

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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
