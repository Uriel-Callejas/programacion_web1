/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_11;

import java.util.Scanner;

/**
 *
 * @author URIEL
 */
public class EJ_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un nombre completo:");
        String str = scanner.nextLine(),res="";
        char x;
        
        res+=str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            x=str.charAt(i);
            if (x==' ') {
                res+=str.charAt(i+1);
            }
        }
        
        res=res.toUpperCase();
        System.out.println("Iniciales del nombre: "+res);
    }
    
}
