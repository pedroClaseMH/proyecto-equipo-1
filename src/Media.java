/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media;

import java.util.Scanner;

/**
 *
 * @author DAW104
 */
public class Media {

    public static void main(String[] args) {
        int num = 0, cont_pos = 0, cont_neg = 0, suma_pos = 0, suma_neg = 0;
        float media_pos = 0, media_neg = 0;
        System.out.println("Introduce número 0 para salir: " );
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        while (num != 0) {
            if (num > 0) {
                cont_pos++;
                suma_pos += num;
            } else {
                cont_neg++;
                suma_neg += num;
            }
            System.out.println("Introduce número: ");
            num = entrada.nextInt();
        }
        if (cont_pos != 0) {
            media_pos = suma_pos / cont_pos;
            System.out.println(
            "Media de los números positivosintroducidos: " + media_pos);
        }
        if (cont_neg != 0) {
            media_neg = suma_neg / cont_neg;
            System.out.println(
            "Media de los números negativos introducidos: " + media_neg);
        }

    }
}
