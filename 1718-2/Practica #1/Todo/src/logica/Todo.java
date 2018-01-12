package logica;

/**
 *
 * @author Jose Roberto Quevedo
 */
public class Todo {
    private String mensaje;
    private String fecha;
    private int indice;
    private boolean activo;

    public Todo(String mensaje, String fecha, int indice, boolean activo) {
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.indice = indice;
        this.activo = activo;
    }
    
}
