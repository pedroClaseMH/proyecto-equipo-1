/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main_entornos;

import java.util.Scanner;

/**
 *
 * @author DAW105
 */
public class Ejercicio_para_entornos_benjamin_equipo_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
System.out.println("EJERCICIO CON SWITCH QUE PIDE UN NÚMERO DEL 1 AL 7 Y DA EL DÍA DE LA SEMANA");
        
Scanner teclado = new Scanner(System.in);        
        System.out.println("Escribe un número entre 1 y 7: ");
        int num= teclado.nextInt();        
 teclado.close();
 
 
String diasem = switch (num)
{
case 1-> "Lunes";
case 2-> "Martes";
case 3-> "Miércoles";
case 4-> "Jueves";
case 5-> "Viernes";
case 6-> "Sábado";
case 7-> "Domingo";
default-> "Has introducido un número incorrecto";
};

System.out.println("Hoy es "+diasem);   
        
        
    }
    
}
