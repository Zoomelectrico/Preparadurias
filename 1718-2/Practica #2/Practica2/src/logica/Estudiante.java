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
public class Estudiante extends Usuario {
    private long carnet;
    private String[] materias;
    
    public Estudiante (String nombre, long cedula, String email, String password) {
        super(nombre, cedula, email,password);
        Random random = new Random(); 
        this.carnet = random.nextLong();
        int n = random.nextInt(5)+1;
        this.materias = new String[n];
        for (int i = 0; i < materias.length; i++) {
            materias[i] = "BPTXX" + String.valueOf(i+1);
        }
        this.presentar();
    }
    public void presentar(){
        System.out.println("Soy Estudiante");
        System.out.println(cedula);
        for (String materia : materias) {
            System.out.println("* " + materia);
        }
    }
    
}
