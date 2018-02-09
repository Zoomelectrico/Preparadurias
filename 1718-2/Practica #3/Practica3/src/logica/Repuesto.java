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
public abstract class Repuesto {
    protected String nombre;
    protected Long numeroParte;
    protected String fabricante;
    protected int posAlmacen;
    protected double precio;
    
    
    public Repuesto (String nombre, long numeroParte, String fabricante, int posAlcamen, double precio) {
        this.nombre = nombre;
        this.numeroParte = numeroParte;
        this.fabricante = fabricante;
        this.posAlmacen = posAlcamen;
        this.precio = precio;
    }
    
    public abstract void consultar(Usuario u); 

    public void presentarGerente(String especial) {
        String s = this.nombre + "-" + Long.toString(this.numeroParte) 
                + "-" + this.fabricante + "-" + especial 
                + "-" + Integer.toString(this.posAlmacen) 
                + "-" + Double.toString(this.precio);
        System.out.println(s);
    }
    
    public void presentarMecanico(String especial) {
        String s = this.nombre + "-" + Long.toString(this.numeroParte) 
                + "-" + this.fabricante + "-" + especial 
                + "-" + Integer.toString(this.posAlmacen);
        System.out.println(s);
    }
    
    public void presentarAdministrativo (String especial) {
        String s = this.nombre + "-" + Long.toString(this.numeroParte) 
                + "-" + this.fabricante + "-" + especial 
                + "-" + Double.toString(this.precio);
        System.out.println(s);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNumeroParte() {
        return numeroParte;
    }

    public void setNumeroParte(Long numeroParte) {
        this.numeroParte = numeroParte;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    
    
}
