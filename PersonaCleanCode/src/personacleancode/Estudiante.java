
package personacleancode;

public class Estudiante {
    private String codigoMatricula;
    private int curso;

    public Estudiante(String codigoMatricula, int curso) {
        this.codigoMatricula = codigoMatricula;
        this.curso = curso;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    
    
}