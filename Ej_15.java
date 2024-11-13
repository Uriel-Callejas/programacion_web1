/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_15;

import java.util.Scanner;

/**
 *
 * @author URIEL
 */
public class Ej_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un texto");
        String str = scanner.nextLine();
        String res = "";
        char x;
        for (int i = 0; i < str.length()-1; i++) {
            x=str.charAt(i);
            res=x+res;
        }
        res=str+res;
        System.out.println("Palindromo resultante: "+res);
    }
    
}
