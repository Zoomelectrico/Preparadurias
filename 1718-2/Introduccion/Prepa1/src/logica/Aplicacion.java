package logica;
        
import java.util.Scanner;

class Aplicacion {
    public static void main(String[] args){
        // DIVIDIR
        
        // Variables
        int a = 0;
        int b = 0;
        String nombre;
        
        // Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HOLA BRO... CUAL ES TU NOMBRE?");
        nombre = sc.nextLine();
        // concatenacion
        System.out.println("Fino "+nombre+" vamos a dividir");
        System.out.println("Ingresa el numero a: ");
        a = sc.nextInt();
        System.out.println("Ingresa el numero b: ");
        b = sc.nextInt();
        int c = 0;
        
        // Asegurarnos que la operacion no vaya a dar error ej 1/0
        try {
            c = a/b; // Operacion
        } catch (ArithmeticException e) { //Si falla se crea una excepcion "e"
            System.out.println("Error... " + e.getMessage()); // Decimos que fue lo que paso
        } finally {
        	// ESTA CLAUSULA SIEMPRE SE EJECUTA
        	System.out.println(c); // Imprimimos el resultado o 0 si hubo una excepcion
            System.out.println("Gracias por usarme"); // Mensaje Final
        }
    }
}