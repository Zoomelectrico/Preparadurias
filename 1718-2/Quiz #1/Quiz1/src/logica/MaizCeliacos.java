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
public class MaizCeliacos extends Maiz{
    
    public MaizCeliacos () {
        super();
        this.precio = this.peso*3000;
        Random r = new Random();
        int al = r.nextInt(10)+ 1;
        if (al == 1) {
            this.malo = true;
        } else {
            this.malo = false;
        }
    }
    
    @Override
    public void tipoMaiz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
