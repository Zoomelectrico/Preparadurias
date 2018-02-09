/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Jose Roberto Quevedo
 */
public class Aplicacion {

    private Repuesto[] almacen;
    
    public Aplicacion () {
        this.almacen = new Repuesto[1000];
    }
    
    public Repuesto buscar(String s) {
        Repuesto r = null;
        for (int i = 0; i < almacen.length; i++) {
            if(almacen[i].nombre.equalsIgnoreCase(s)) {
                r = almacen[i];
                break;
            }
        }
        return r;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
