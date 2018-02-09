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
public class piezaMecanica extends Repuesto implements Comparable<piezaMecanica> {

    private String descripcion;
    
    public piezaMecanica(String nombre, long numeroParte, String fabricante, int posAlcamen, double precio, String descripcion) {
        super(nombre, numeroParte, fabricante, posAlcamen, precio);
        this.descripcion = descripcion;
    }

    @Override
    public void consultar(Usuario u) {
        if (u instanceof Gerente) {
            this.presentarGerente(descripcion);
        } else if (u instanceof Mecanico){
            this.presentarMecanico(descripcion);
        } else {
            this.presentarAdministrativo(descripcion);
        }
    }

    @Override
    public int compareTo(piezaMecanica o) {
        return this.descripcion.compareToIgnoreCase(o.descripcion);
    }
    
}
