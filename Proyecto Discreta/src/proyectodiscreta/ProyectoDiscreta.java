/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodiscreta;

import java.util.Scanner;

/**
 *
 * @author UCA
 */
public class ProyectoDiscreta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NF, NA, NAC, NC;//numero filas, numero asientos por fila, numero de asientos por columna, numero de columnas
        float PT;// Probabilidad total
        System.out.println("Ingrese el numero de filas que tiene el avion \n");
        NF = sc.nextInt();
        System.out.println("Ingrese el numero de asientos por columna columnas \n");
        NAC = sc.nextInt();
        System.out.println("Ingrese le numero de columnas");
        NC = sc.nextInt();
        PT = (float) ((((NAC - 1) * NF) / (Math.pow(NAC, 2) * NF))) / NC;
        System.out.println(PT);
    }

}
