/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.*;

/**
 *
 * @author Jose Roberto Quevedo
 */
public class Archivos {

    public static void leer(String ruta) {
        try {
            File file = new File(ruta); // Representacion del archivo
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);

            String linea;

            while (buffer.readLine() != null) {
                System.out.println(buffer.readLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void escribir(String ruta) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(ruta));
            for (int i = 0; i < 10; i++) {
                writer.println("hola mundo");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        escribir("C:\\Users\\Jose Roberto Quevedo\\Documents\\doc.txt");
        leer("C:\\Users\\Jose Roberto Quevedo\\Documents\\doc.txt");
    }

}
