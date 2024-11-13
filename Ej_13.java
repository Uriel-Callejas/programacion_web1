/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_13;

import java.util.Scanner;

/**
 *
 * @author URIEL
 */
public class Ej_13 {

    public static boolean verificarAbecegrama(String texto) {
        String abc="abcdefghijklmnopqrstuvwxyz";
        int cont=0;
        char x;
        texto = texto.toLowerCase();
        if (texto.charAt(0)==abc.charAt(cont)) {
            cont++;
            for (int i = 0; i < texto.length(); i++) {
                x=texto.charAt(i);
                if (x==' ') {
                    if (texto.charAt(i+1)==abc.charAt(cont)) {
                        cont++;
                    }else {
                        return false;
                    }
                }
            }
        }else{
            return false;
        }
        
        return true;
        
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Paso 1: Leer el texto ingresado por el usuario
        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine().toLowerCase(); // Convertimos el texto a minúsculas para estandarizarlo

        // Paso 2: Verificar si es un abecegrama
        boolean esAbecegrama = verificarAbecegrama(texto);

        // Paso 3: Mostrar el resultado
        if (esAbecegrama) {
            System.out.println("Es un abecegrama.");
        } else {
            System.out.println("No es un abecegrama.");
        }
        scanner.close();
    }
}
