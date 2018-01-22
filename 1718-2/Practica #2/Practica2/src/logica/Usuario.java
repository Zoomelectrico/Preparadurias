/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public class Usuario {
    protected String nombre;
    protected long cedula;
    protected String email;
    protected String password;

    public Usuario(String nombre, long cedula, String email, String password) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.password = password;
    }

    
    
}
