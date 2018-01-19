/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author Profesores
 */
public class Aplicacion {

    private Usuario[] usuarios;
    private Usuario userActual;

    public Aplicacion() {
        this.usuarios = new Usuario[3];
    }

    public void run () {
        while (true) {
            menu(); 
            System.out.println("Ingresa 1 si quieres salir");
            int r = sc.nextInt();
            if (r == 1) {
                break;
            }
        }
    }

    public void menu() {
        // Bienvenida del usuario
        System.out.println("Bienvenido al Todo App");
        System.out.println("1. Crear un Nuevo Usuario");
        System.out.println("2. Agregar un Todo a la Lista");
        System.out.println("3. Eliminar un Todo de la Lista");
        System.out.println("4. Marcar como listo un Todo");
        System.out.println("Ingresa el numero correspondiente a la opcion que deseas ejecutar");
        //Flujo de control sobre el input del usuario
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        switch (var) {
            case 1:
                this.crearUsuario();
                break;
            case 2:
                this.hacerTodo();
                break;
            case 3:
                this.eliminarTodo();
                break;
            case 4:
                this.marcarListoTodo();
                break;
            default:
                System.out.println("Uppps... Rompiste algo y no sabemos que fue");
        }
    }
    /**
     * Esto es un Javadoc
     */
    public void crearUsuario() {
        // Helper para leer datos
        Scanner sc = new Scanner(System.in);

        //Lectura de datos
        System.out.println("Ingrese su Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese Profesion: ");
        String profesion = sc.nextLine();

        // Creamos un Nuevo usuario    
        Usuario user = new Usuario(nombre, edad, profesion);
        // Lo guardamos en el vector
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                this.usuarios[i] = user;
                System.out.println(user.getNombre() + " Usuario Guardado");
                this.userActual = user;
                break;
            }
        }
    }

    public void hacerTodo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime cual es tu mensaje: ");
        String mensaje = sc.next();

        Todo todo = new Todo(mensaje);
        userActual.guardarItem(todo);
        System.out.println("Todo Añadido");

    }

    public void marcarListoTodo() {
        Scanner sc = new Scanner(System.in);
        // Impimir Todo List
        for (int i = 0; i < userActual.getListaItems().length; i++) {
            if (userActual.getListaItems()[i]
                    != null) {
                System.out.println(String.valueOf(i) + " " + userActual.getListaItems()[i].getMensaje());
            }
        }
        System.out.println("Ingresa el numero que quieres eliminar: ");
        int i = sc.nextInt();
        userActual.marcarLista(i);
    }

    public void eliminarTodo() {
        Scanner sc = new Scanner(System.in);
        // Impimir Todo
        for (int i = 0; i < userActual.getListaItems().length; i++) {
            if (userActual.getListaItems()[i] != null) {
                System.out.println(String.valueOf(i) + " " + userActual.getListaItems()[i].getMensaje());
            }
        }
        System.out.println("Ingresa el numero que quieres eliminar: ");
        int i = sc.nextInt();
        userActual.eliminar(i);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplicacion app = new Aplicacion();
        app.run();
    }
}
