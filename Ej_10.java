/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_10;

import java.util.Scanner;

/**
 *
 * @author URIEL
 */
public class Ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String str = scanner.nextLine();
        
        int minusculas = 0;
        int mayusculas = 0;
        int numeros = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }
        System.out.println("Numero de letras minusculas: " + minusculas);
        System.out.println("Numero de letras mayusculas: " + mayusculas);
        System.out.println("Numero de numeros: " + numeros);
    }
    
}
