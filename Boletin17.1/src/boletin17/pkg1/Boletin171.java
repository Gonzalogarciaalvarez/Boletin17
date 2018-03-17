/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17.pkg1;

/**
 *
 * @author Gonzalo
 */
public class Boletin171 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numeros objNum = new Numeros();
        int numeros[] = new int[6];
        objNum.darValor(numeros);
        objNum.mostrarArray(numeros);
        objNum.ordenar(numeros);
        System.out.println("\n***********\n");
        objNum.mostrarArray(numeros);
        System.out.println("\n***********\n");
        objNum.mostrarArrayReves(numeros);
    }
    
}
