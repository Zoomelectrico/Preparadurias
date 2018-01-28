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
public class MaizRegular extends Maiz{
    
    public MaizRegular () {
        super();
        this.precio = peso * 2000;
        Random r = new Random ();
        int al = r.nextInt(15) + 1;
        if (al == 1) {
            this.malo = true;
        } else {
            this.malo = false;
        } 
    }
        
    public void tipoMaiz(){
    
    }
}
