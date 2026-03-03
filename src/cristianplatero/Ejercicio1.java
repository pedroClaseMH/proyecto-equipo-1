/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoja1;

/**
 *
 * @author daw1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
    int num1 = (int)(Math.random()* 100);
    int num2 = (int)(Math.random()* 100);

    if(num1 < num2){
        System.out.println("El primer numero es mayor.");
        
    }else if(num2 < num1){
        System.out.println("El segundo numero es mayor.");
    }else{
        System.out.println("Los dos números son iguales");
    }
        
    }
}
