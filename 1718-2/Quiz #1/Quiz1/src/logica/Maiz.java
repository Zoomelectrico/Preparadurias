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
public abstract class Maiz {
    protected int peso;
    protected boolean malo;
    protected double precio;
    
    public Maiz () {
        Random r = new Random();
        this.peso = 200 + r.nextInt(1300);
    }
    
    public abstract void tipoMaiz();
    
    public boolean getMalo () {
        return malo;
    }

    public int getPeso() {
        return peso;
    }

    public double getPrecio() {
        return precio;
    }
    
}
