/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Profesores
 */
public class Usuario {
    
    // Los atributos de la clase
    private String nombre;
    private int edad;
    private String profesion;
    private Todo[] listaItems;
    
    public Usuario (String nombre, int edad, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.listaItems = new Todo[10];
    }

    public void guardarItem (Todo todo) {
        for (int i = 0; i < listaItems.length; i++) {
            if (listaItems[i] == null) {
                listaItems[i] = todo;
                break;
            }
        }
        imprimir();
    }
    
    public void imprimir() {
        for (int i = 0; i < listaItems.length; i++) {
            if (listaItems[i] != null) {
                String mensaje = listaItems[i].getMensaje();
                System.out.println(mensaje);
                
            }        
        }
    }
    
    public void marcarLista (int i) {
        this.listaItems[i].setTerminado(true);
    }
    
    public void eliminar (int i) {
        this.listaItems[i] = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Todo[] getListaItems() {
        return listaItems;
    }

    public void setListaItems(Todo[] listaItems) {
        this.listaItems = listaItems;
    }
    
    
}
