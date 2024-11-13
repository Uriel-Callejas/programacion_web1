/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_16_otro;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_16_otro {
    public static boolean esVocal(char x){
        String aux="aeiouAEIOU";
        for (int j = 0; j < aux.length(); j++) {
                if (x==aux.charAt(j)) {
                   return true;
                }                
            }
        return false;
    }

    public static void rotarVocales(String cadena) {
        char[] caracteres = cadena.toCharArray();
        int n = caracteres.length;
        
        char x,y=' ',z;
        int c=0;
        // Encontrar el índice de la última vocal
        for (int i = 0; i < cadena.length(); i++) {
            c++;
            x=cadena.charAt(i);
            if (esVocal(x)) {
                y=x;
                break;
            }
        }
        for (int i = c; i < cadena.length(); i++) {
            x=cadena.charAt(i);
            if (esVocal(x)) {
                caracteres[i]=y;
                y=x;
            }
        }
        caracteres[c-1]=y;
        String res= new String (caracteres);
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = sc.nextLine().toLowerCase();
        rotarVocales(texto);
    }    
}
