package logica;

import java.util.Scanner;

/**
 *
 * @author Jose Roberto Quevedo
 */
public class Aplicacion {
    // Atributos de la Clase
    private Usuario[] usuarios;
    private Usuario actualUser;

    Aplicacion() {
        this.usuarios = new Usuario[3];
    }

    private boolean fullUsuarios() {
        boolean full = true;
        for (Usuario usuario : usuarios) { // For each loop
            if (usuario == null) {
                full = false;
                break;
            }
        }
        return full;
    }
    
    private void ingresarUser(Usuario user) {
        if (user != null) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] == null) { // Si no hay nada alli ingresalo 
                    usuarios[i] = user;
                }
            }
        }
    }
    
    public boolean crearUsuario() {
        if (fullUsuarios()) {
            Scanner sc = new Scanner(System.in); // Con esto podemos leer datos del teclado
            String nombre, profesion;
            int edad;

            // Lectura de los Datos
            System.out.println("Bienvenido al To Do App");
            System.out.println("Por favor Ingrese su Nombre: ");
            nombre = sc.nextLine();
            System.out.println("Por favor Ingrese su Profesion: ");
            profesion = sc.nextLine();
            System.out.println("Por favor Ingrese su Edad: ");
            edad = sc.nextInt();

            // Creacion del Objeto
            Usuario user = new Usuario(nombre, profesion, edad);
            ingresarUser(user);
            
            // Notificación al Usuario
            System.out.println("Usuario Ingresado");
            
            // Mensaje para continuar la ejecucion
            return true;
        } else {
            // El programa esta a maxima capacidad
            System.out.println("En este momento no podemos ingresar mas usuarios");
            
            // Mensaje para terminar la ejecucion
            return false;
        }
    }
    public boolean eliminarUsuario(){
        return true;
    }
    public void cambiarUsuario() {
    }
    public boolean crearTodo(Usuario u){
        // Declaracion de Variables
        String mensaje, fecha;
        Scanner sc = new Scanner(System.in);
        
        // Recopilacacion de datos
        System.out.println("Ingrese un Mensaje: ");
        mensaje = sc.next();
        System.out.println("Ingrese la fecha de hoy [dd-mm-aa]");
        fecha = sc.nextLine();
        
        // Warning al sistema de que paso con el mensaje
        return u.guardarTodo(mensaje, fecha);
    }
    
    public void menu() {
        
        // Impresion del Menu
        System.out.println("==================== Menu ====================");
        System.out.println("Ingrese el numero de la opcion que sea ingresar");
        System.out.println("1. Crear un Usuario");
        System.out.println("2. Eliminar un Usuario");
        System.out.println("3. Cambiar de Usuario Usuario");
        System.out.println("4. Crear un To Do");
        System.out.println("5. Eliminar un To Do");
        System.out.println("6. Ver lista de To Do");
        System.out.println("7. Ver lista de To Do [Todos los usuarios]");
        System.out.println("8. Salir");
        
        // Leer la opción
        int resp = new Scanner(System.in).nextInt(); // Otra forma de crear un objeto
        switch (resp) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;    
            case 5:
                break;        
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                System.out.println("Mano que intentas jajajajja");
                break;
        }
    }
    
    public void run() {
        while (true) {
            
        }
    }
    
    public static void Main(String[] args) {
        Aplicacion app = new Aplicacion();
    }
}
