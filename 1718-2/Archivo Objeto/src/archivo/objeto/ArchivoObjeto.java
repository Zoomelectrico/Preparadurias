package archivo.objeto;

import java.io.*;

/**
 *
 * @author Jose Roberto Quevedo
 */

public class ArchivoObjeto implements Serializable{

    public ArchivoObjeto() {
        
    }
    
    
    public static void escribirArchivo() {
        try {
            FileOutputStream file = new FileOutputStream("archivo.DAT");
            ObjectOutputStream out = new ObjectOutputStream(file);
            Persona p = new Persona("Jose", 19);
            out.writeObject(p);
            out.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void leerArchivos() {
        try {
            FileInputStream file = new FileInputStream("archivo.DAT");
            ObjectInputStream in = new ObjectInputStream(file);
            
            Persona p = (Persona) in.readObject();
            
            System.out.println(p.toString());
            // Aja muchachos el error que teniamos en la prepa es que no le estaba diciendo que imprimiera :)
        } catch(IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        escribirArchivo();
        leerArchivos();
    }
    
}
