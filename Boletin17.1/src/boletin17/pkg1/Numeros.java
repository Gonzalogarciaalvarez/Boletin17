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
public class Numeros {
    int numr;

    public void darValor(int[] num) {
        for (int nam = 0; nam < num.length; nam++) {
            numr = (int) (Math.random() * 50) + 1;
            num[nam] = numr;
        }
    }

    public void mostrarArray(int[] num) {
        for (int nam = 0; nam < num.length; nam++) {
            System.out.println("Numero: " + num[nam]);
        }
    }

    public void mostrarArrayReves(int[] num) {

        for (int nam = num.length - 1; nam >= 0; nam--) {
            System.out.println("Numero: " + num[nam]);
        }
    }

    public void ordenar(int[] num) {
        int i, j;
        int aux;
        for (i = 0; i < num.length - 1; i++) {
            for (j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
    }

}
