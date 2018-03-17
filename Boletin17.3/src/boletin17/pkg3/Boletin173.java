/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17.pkg3;

/**
 *
 * @author Gonzalo
 */
public class Boletin173 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] notalumnos = new int[30];

        String[] alumnos = new String[30];
        Alumnos objAlumnos = new Alumnos();
        objAlumnos.alumnoNombre(alumnos);
        objAlumnos.insertarNota(notalumnos);
        objAlumnos.mostrarAlumnos(alumnos, notalumnos);
        objAlumnos.aprobadosSuspensos(notalumnos);
        objAlumnos.alumnosAprobados(alumnos, notalumnos);
        objAlumnos.calcularNotaMedia(notalumnos);
        objAlumnos.notaMasAlta(notalumnos);
        objAlumnos.ordenar(alumnos,notalumnos);
        objAlumnos.mostrarAlumnos(alumnos, notalumnos);
        objAlumnos.buscar(notalumnos, alumnos);
    }
    }
