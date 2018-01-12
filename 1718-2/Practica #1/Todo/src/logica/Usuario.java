package logica;

/**
 *
 * @author Jose Roberto Quevedo
 */
public class Usuario {

    private String nombre;
    private String profesion;
    private int edad;
    private Todo[] lista;

    public Usuario(String nombre, String profesion, int edad) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.edad = edad;
        this.lista = new Todo[10];
    }

    private boolean estaLleno() {
        boolean full = true;
        for (Todo todo : lista) {
            if (todo == null) {
                full = false;
                break;
            }
        }
        return full;
    }

    public boolean guardarTodo(String mensaje, String fecha) {
        if (estaLleno()) {
            return false;
        } else {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] == null) {
                    lista[i] = new Todo(mensaje, fecha, i, true);
                }
            }
            return true;
        }
    }

}
