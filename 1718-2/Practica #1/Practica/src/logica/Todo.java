/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Profesores
 */
public class Todo {
    private String mensaje;
    private boolean terminado;
    
    public Todo (String mensaje) {
        this.mensaje = mensaje;
        this.terminado = false;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
}
