
package personamalaspracticas;

public class Numero {
    private String numero;
    private char letra;
    
    public Numero (){
        
    }
    
    public Numero(String numero, char letra) {
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
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int num = Integer.parseInt(this.numero);
        int resto = num % 23;
        return letras.charAt(resto);
    }

    @Override
    public String toString() {
        return numero + "-" + letra;
    }
}
