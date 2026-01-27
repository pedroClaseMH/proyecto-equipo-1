/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto.equipo_1;

/**
 *
 * @author DAW104
 */
public class ProyectoEquipo_1 {

    public static void main(String[] args) {
        //Este programa crea una tabla de 5x5 con un array bidimensional
        int[][] pro = new int[5][5];//Array bidimensional
        
        for (int i = 0; i < pro.length; i++) {//estructura de control que rellena el array
            for (int j = 0; j < pro.length; j++) {
                System.out.print(pro[i][j]);
            }
            System.out.println("");

            //8. el programa funciona correctamente, por consola saca un array 5x5 
        }
        
    }
}
