/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17.pkg2;

/**
 *
 * @author Gonzalo
 */
public class Boletin172 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        int alumnos[] = new int[30];
        
        Notas objNotas = new Notas();
        
        objNotas.insertarNota(alumnos);
        objNotas.clasificar(alumnos);
        objNotas.calcularNotaMedia(alumnos);
        objNotas.notaMasAlta(alumnos);
    }
    
}
