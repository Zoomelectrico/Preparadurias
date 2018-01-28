/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public class Cosecha {
    private Maiz[] cosecha;
    
    public Cosecha() {
        this.cosecha = new Maiz[5000];
        for (int i = 0; i < cosecha.length; i++) {
            if (i%2 == 0) {
                cosecha[i] = new MaizRegular();
            } else {
                cosecha[i] = new MaizCeliacos();
            }
        }
    }
    
    public Maiz[] getCosecha () {
        return cosecha;
    } 
}
