/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17.pkg4;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class Boletin174 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CalcularDNI obx = new CalcularDNI();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca DNI");
        obx.calculaLetra(sc.nextInt());
    }
    
}
