
package personacleancode;
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private char sexo;
    private DNI dni;
    private Estudiante estudiante;
    private String pais;

    public Persona(String nombre, String apellido1, String apellido2, int edad, char sexo, DNI dni, String pais) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 120) {
            System.out.println("La edad debe estar entre 0 y 120 años.");
        } else {
            this.edad = edad;
        }
    }

    public char getSexo() {
        return sexo;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}

