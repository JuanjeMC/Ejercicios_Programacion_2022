/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.ECB6;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int rMIN;
        int rMAX;
        int M;
        int i;
        int resultado;
        

        System.out.println("Ingrese un número para conocer sus multiplos:");
        M = teclado.nextInt();
        System.out.println("Ingrese un número mínimo:");
        rMIN = teclado.nextInt();
        System.out.println("Ingrese un número máximo:");
        rMAX = teclado.nextInt();

        //Conocer los resultados de los multiplos entre rMIN y rMAX
        for (i = 1; i <= rMAX; i++) {
            resultado = M * i;
            if (resultado >= rMIN && resultado <= rMAX) {
                System.out.println("->" + resultado);
            }
        }
       
            
                    
    }

}