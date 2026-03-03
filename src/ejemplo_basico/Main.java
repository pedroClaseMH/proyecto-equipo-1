/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplobasico;

import java.util.Scanner;

/**
 *
 * @author subie
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionAlumnos gestion = new GestionAlumnos();
        int opcion;

        do {
            System.out.println("1. Añadir alumno");
            System.out.println("2. Listar alumnos");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    gestion.añadirAlumno(new Alumno(dni, nombre));
                    break;

                case 2:
                    gestion.listarAlumnos(); // 
                    break;

                case 0:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 0);
    }

        
        
        
    }

