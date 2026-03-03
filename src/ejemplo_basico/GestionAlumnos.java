/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplobasico;

/**
 *
 * @author subie
 */
public class GestionAlumnos {
    private Alumno[] alumnos;
    private int contador;

    public GestionAlumnos() {
        contador = 0;
        
    }

    public void añadirAlumno(Alumno a) {
        alumnos[contador] = a;  
        contador++;
    }

    public void listarAlumnos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(alumnos[i]); 
        }
    }

}
