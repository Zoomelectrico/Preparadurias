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
public class piezaCarroceria extends Repuesto implements Comparable<piezaCarroceria>{

    private long serialCarroceria;
    
    public piezaCarroceria(String nombre, long numeroParte, String fabricante, int posAlcamen, double precio, long serialCarroceria) {
        super(nombre, numeroParte, fabricante, posAlcamen, precio);
        this.serialCarroceria = serialCarroceria;
        
    }

    @Override
    public void consultar(Usuario u) {
        if (u instanceof Gerente) {
            this.presentarGerente(Long.toString(this.serialCarroceria));
        } else if (u instanceof Mecanico){
            this.presentarMecanico(Long.toString(this.serialCarroceria));
        } else {
            this.presentarAdministrativo(Long.toString(this.serialCarroceria));
        }
    }

    @Override
    public int compareTo(piezaCarroceria o) {
        if(this.serialCarroceria == o.serialCarroceria) {
            return 0;
        } else if (this.serialCarroceria > o.serialCarroceria) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
