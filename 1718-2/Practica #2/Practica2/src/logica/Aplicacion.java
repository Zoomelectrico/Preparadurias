/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Aplicacion {
    private Usuario[] usuarios;
    
    public Aplicacion () {
        System.out.println("Bienveñ.asdlñ,asld");
        Random random = new Random();
        this.usuarios = new Usuario[random.nextInt(10)];
        for (int i = 0; i < usuarios.length; i++) {
            if ( i % 2 == 0) {
                usuarios[i] = new Estudiante("...", random.nextLong(), "AA", "11");
            } else {
                usuarios[i] = new Profesor("...", random.nextLong(), "AA", "11");
            }
        }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplicacion app = new Aplicacion();
        
    }
    
}
