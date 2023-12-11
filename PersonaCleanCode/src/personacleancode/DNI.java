
package personacleancode;
public class DNI {
    public static final String JUEGO_LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    private String numero;
    private char letra;
    
    public DNI (){
        
    }
    
    public DNI(String numero, char letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public char calcularLetra() {
        String letras = JUEGO_LETRAS;
        int num = Integer.parseInt(this.numero);
        int resto = num % 23;
        return letras.charAt(resto);
    }

    @Override
    public String toString() {
        return numero + "-" + letra;
    }
}
