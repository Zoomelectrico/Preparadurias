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
public class piezaElectronica extends Repuesto implements Comparable<piezaElectronica>{

    private double maxVoltaje;
    
    public piezaElectronica(String nombre, long numeroParte, String fabricante, int posAlcamen, double precio, double maxVoltaje) {
        super(nombre, numeroParte, fabricante, posAlcamen, precio);
        this.maxVoltaje = maxVoltaje;
    }


    @Override
    public void consultar(Usuario u) {
        if (u instanceof Gerente) {
            this.presentarGerente(Double.toString(this.maxVoltaje));
        } else if (u instanceof Mecanico){
            this.presentarMecanico(Double.toString(this.maxVoltaje));
        } else {
            this.presentarAdministrativo(Double.toString(this.maxVoltaje));
        }
    }

    @Override
    public int compareTo(piezaElectronica o) {
        if(this.maxVoltaje == o.maxVoltaje) {
            return 0;
        } else if (this.maxVoltaje > o.maxVoltaje) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
