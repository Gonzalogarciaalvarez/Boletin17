/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17.pkg4;

/**
 *
 * @author Gonzalo
 */
public class CalcularDNI {
    
        public void  calculaLetra(int dni) {
        String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = dni % 23;
        char letra = juegoCaracteres.charAt(modulo);
        System.out.println("DNI: "+dni+letra);
    }
}
