
package personamalaspracticas;

/**
 *
 * @author Helen
 * @version 11/12/2023
 */
public class PersonaMalasPracticas {

    public static void main(String[] args) {
        Numero asdfljasdfkljahsdf = new Numero("12345678", 'A');
        Numero dni2 = new Numero();
        dni2.setNumero("06421478");
        dni2.setLetra(dni2.calcularLetra());

        Persona persona1 = new Persona("Helenca", "Rábano", "Fernández", 41, 'F', asdfljasdfkljahsdf,"España");
        Persona persona2 = new Persona("Tania","García","Martínez",28,'F',dni2,"EEUU");
        
        nombre(persona1);
        
        int suma = sumar(1,2);
        System.out.println(suma);
        suma = agregar(2,1);
        System.out.println(suma);
        
        
        if (persona1.getEdad()<=5 || persona1.getEdad()==10 || persona1.getEdad()==17 || persona1.getEdad()==20 || persona1.getEdad()==30 || persona1.getEdad()==40) {
            System.out.println("Tienes la edad correcta para recibir nuestro regalo!");
        }
        
        Estudiar est = new Estudiar("aerdsD4", 1);
        persona1.setEstudiar(est);

        boolean personaEsAlumno=false;
        if(persona1.getEstudiar()!=null){
            personaEsAlumno = true;
        }
        
        darBienvenida(persona1, personaEsAlumno);
        
        //Este if comprueba si la edad de la persona es >=18 y entonces dice que es mayor de edad, si no entonces dice que es menor
        if(persona1.getEdad()>=18){
            System.out.println(persona1.getNombre()+" "+persona1.getApellido1()+" "+persona1.getApellido2()+" es mayor de edad.");
        }else{
            System.out.println(persona1.getNombre()+" "+persona1.getApellido1()+" "+persona1.getApellido2()+" es menor de edad.");
        }
        if(persona2.getEdad()>=18){
            System.out.println(persona2.getNombre()+" "+persona2.getApellido1()+" "+persona2.getApellido2()+" es mayor de edad.");
        }else{
            System.out.println(persona2.getNombre()+" "+persona2.getApellido1()+" "+persona2.getApellido2()+" es menor de edad.");
        }
        
        double r = 3.0;
        double a = Math.PI*Math.pow(r, 2); //Área del cuadrado
        System.out.println("El área es: "+a);
        
    }
    
    private static void nombre(Persona persona){
        System.out.println(persona.getNombre());
    }
    
    //INICIO: Operaciones matemáticas
    private static int sumar(int numero1, int numero2){
        return numero1+numero2;
    }
    
    private static int agregar(int numero2, int numero1){
        return numero2+numero1;
    }
    
    private static double calculadora(String operacion, double numero1, double numero2){
        double resultado = 0;
        switch(operacion){
            case "suma":
                resultado = numero1+numero2;
            break;
            case "resta":
                resultado = numero1-numero2;
            break;
            case "multiplicacion":
                resultado = numero1*numero2;
            break;
            case "division":
                resultado = numero1/numero2;
            break;
            case "modulo":
                resultado = numero1%numero2;
            break;
            case "par":
                resultado = numero1%2;
            break;
            case "divide10":
                resultado = numero1%10;
            break;
            case "raiz":
                resultado = Math.sqrt(numero2);
            break;
            case "potencia":
                resultado = Math.pow(numero1, numero2);
            break;
            case "potencia2":
                resultado = Math.pow(numero1, 2);
            break;
            case "potencia2binaria":
                resultado = Math.pow(2, numero1);
            break;
            case "seno":
                resultado = Math.sin(numero1);
            break;
            case "coseno":
                resultado = Math.cos(numero1);
            break;
            case "tangente":
                resultado = Math.tan(numero1);
            break;
        }
        return resultado;
    }
    //FINAL: Operaciones matemáticas
    
    
    //INICIO: Mensajes
    private static void darBienvenida(Persona persona, boolean personaEsAlumno){
        if (personaEsAlumno) {
            System.out.println("Bienvenido alumn@!: "+persona.getNombre());
        }else{
            System.out.println("Bienvenido profesor o invitado!: "+persona.getNombre());
        }
    }
    //FINAL: Mensajes
}

