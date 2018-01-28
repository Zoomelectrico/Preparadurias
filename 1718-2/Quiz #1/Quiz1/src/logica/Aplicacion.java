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
public class Aplicacion {
    private Cosecha cosecha; 
    
    public Aplicacion () {
        this.cosecha = new Cosecha();
        estatisticas();
    }
    
    
    public void estatisticas () {
        System.out.println("Estaditicas");
        System.out.println("Maices en buenas condiciones: ");
        System.out.print(maicesBuenaCondiciones());
        System.out.println("===============");
        System.out.println("Maices malos por cepa: ");
        System.out.println(maicesMaloRegular());
        System.out.println(maicesMaloCeliacos());
        System.out.println("===============");
        System.out.println("Maiz mas pesado: ");
        Maiz m = this.mayorPeso();
        System.out.print(Integer.toString(m.getPeso()) + " " + " " + Double.toString(m.getPrecio()));
        System.out.println("===============");
        System.out.println("Ganancias: ");
        System.out.print(this.ganacias());
        System.out.println("===============");
        System.out.println("Perdidas: ");
        System.out.print(this.perdidas());
        System.out.println("===============");
        
        
    }
    
    
    public int maicesBuenaCondiciones () {
        int count = 0;
        Maiz[] maices = cosecha.getCosecha();
        for (int i = 0; i < maices.length; i++) {
           if (!maices[i].getMalo()) {
               count++;
           }
        }
        return count;
    }
    
    public int maicesMaloRegular () {
        int count = 0;
        Maiz[] maices = cosecha.getCosecha();
        for (int i = 0; i < maices.length; i++) {
            if (maices[i].getMalo() && maices[i] instanceof MaizRegular) {
               count++;
            }
        }
        return count;
    }
    
    public int maicesMaloCeliacos () {
        int count = 0;
        Maiz[] maices = cosecha.getCosecha();
        for (int i = 0; i < maices.length; i++) {
            if (maices[i].getMalo() && maices[i] instanceof MaizCeliacos) {
               count++;
            }
        }
        return count;
    }
    
    public Maiz mayorPeso() {
        Maiz maiz;
        Maiz[] maices = cosecha.getCosecha();
        maiz = maices[0];
        for (int i = 1; i < maices.length; i++) {
            if (maices[i].getPeso() > maiz.getPeso() && !maices[i].getMalo()) {
                maiz = maices[i];
            }
        }
        return maiz;
    }

    public double ganacias () {
        double ganancias = 0;
        int pesoMaizRBueno = 0;
        int pesoMaizCBueno = 0;
        Maiz[] maices = cosecha.getCosecha();
        
        for (int i = 0; i < maices.length; i++) {
            if(maices[i] instanceof MaizRegular && !maices[i].getMalo()) {
                pesoMaizRBueno += maices[i].getPeso();
            } else if (maices[i] instanceof MaizCeliacos && !maices[i].getMalo()) {
                pesoMaizCBueno += maices[i].getPeso();
            }
        }
        
        double ingresos = pesoMaizRBueno*2000 + pesoMaizCBueno*3000;
        double egresos = pesoMaizRBueno*1500 + pesoMaizCBueno*2200;
        ganancias = ingresos - egresos;
        return ganancias;
    }
    
    public double perdidas () {
        int pesoMaizRMalo = 0;
        int pesoMaizCMalo = 0;
        Maiz[] maices = cosecha.getCosecha();
        
        for (int i = 0; i < maices.length; i++) {
            if(maices[i] instanceof MaizRegular && maices[i].getMalo()) {
                pesoMaizRMalo += maices[i].getPeso();
            } else if (maices[i] instanceof MaizCeliacos && maices[i].getMalo()) {
                pesoMaizCMalo += maices[i].getPeso();
            }
        }
        
        double egresos = pesoMaizRMalo*1500 + pesoMaizCMalo*2200;
        return egresos;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplicacion app = new Aplicacion();
    }
    
}
