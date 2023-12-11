
package personacleancode;

/**
 *
 * @author Helen
 * @version 11/12/2023
 */
public class PersonaCleanCode {

    public static void main(String[] args) {
        DNI dni1 = new DNI("12345678", 'A');
        DNI dni2 = new DNI();
        dni2.setNumero("06421478");
        dni2.setLetra(dni2.calcularLetra());

        Persona persona1 = new Persona("Helenca", "Rábano", "Fernández", 41, 'F', dni1, "España");
        Persona persona2 = new Persona("Tania","García","Martínez",28,'F',dni2, "EEUU");
        
        imprimir(persona1);
        
        double suma = sumar(1,2);
        System.out.println(suma);
        suma = sumar(2,1);
        System.out.println(suma);
        
        /*En este condicional valoramos si se cumplen las condiciones necesarias para
        recibir un regalo de una promoción*/
        if (persona1.getEdad()<=5 || persona1.getEdad()==10 || persona1.getEdad()==17 || 
            persona1.getEdad()==20 || persona1.getEdad()==30 || persona1.getEdad()==40) {
            System.out.println("Tienes la edad correcta para recibir nuestro regalo!");
        }
        
        Estudiante estudiante = new Estudiante("aerdsD4", 1);
        persona1.setEstudiante(estudiante);
        
        if(persona1.getEstudiante()!=null){
            darBienvenidaAlumno(persona1);
        }else{
            darBienvenidaPersona(persona1);
        }
        
        comprobarSiMayorEdad(persona1);
        comprobarSiMayorEdad(persona2);
        
        double radioCirculo = 3.0;
        double areaCirculo = Math.PI*Math.pow(radioCirculo, 2);
        System.out.println("El área del círculo es: "+areaCirculo);

    }
    
    private static void imprimir(Persona persona){
        System.out.println(persona.getNombre());
    }
    
    //INICIO: Operaciones matemáticas
    private static double sumar(int numero1, int numero2){
        return numero1+numero2;
    }
    
    private static double restar(int numero1, int numero2){
        return numero1-numero2;
    }
    
    private static double multiplicar(int numero1, int numero2){
        return numero1*numero2;
    }
    
    private static double dividir(int numero1, int numero2){
        return numero1/numero2;
    }
    
    private static double obtenerModulo(int numero1, int numero2){
        return numero1%numero2;
    }
    
    private static boolean comprobarPar(int numero1){
        boolean esPar = false;
        if(numero1%2==0){
            esPar = true;
        }
        return esPar;
    }
    
    private static boolean comprobarDivisible10(int numero1){
        boolean esDivisible = false;
        if(numero1%10==0){
            esDivisible = true;
        }
        return esDivisible;
    }
    
    private static double calcularRaiz(int numero1){
        return Math.sqrt(numero1);
    }
    
    private static double calcularPotencia(double numero1,double numero2){
        return Math.pow(numero1, numero2);
    }
    
    private static double calcularPotenciaDe2(double numero1){
        return Math.pow(2, numero1);
    }
    
    private static double calcularSeno(double numero1){
        return Math.sin(numero1);
    }
    
    private static double calcularCoseno(double numero1){
        return Math.cos(numero1);
    }
    
    private static double calcularTangente(double numero1){
        return Math.tan(numero1);
    }
    //FINAL: Operaciones matemáticas
    
    //INICIO: Mensajes
    private static void darBienvenidaAlumno(Persona persona){
        System.out.println("Bienvenido alumn@!: "+persona.getNombre());
    }
    
    private static void darBienvenidaPersona(Persona persona){
        System.out.println("Bienvenido profesor o invitado!: "+persona.getNombre());
    }

    private static void comprobarSiMayorEdad(Persona persona){
        //Dependiendo del país, la edad adulta comienza con diferentes años
        String nombreCompleto = persona.getNombre()+" "+persona.getApellido1()+" "+persona.getApellido2();
        if((persona.getEdad()>=18 && persona.getPais().equals("España")) || (persona.getEdad()>=21 && persona.getPais().equals("EEUU"))){
            System.out.println(nombreCompleto+" es mayor de edad.");
        }else{
            System.out.println(nombreCompleto+" es menor de edad.");
        }
    }
    //Final: Mensajes
}
