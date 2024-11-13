/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_6;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String str=sc.nextLine();
        str=str.toLowerCase();
        String r="",aux="";
        str=str.trim();
        char x;
        for (int i = 0; i < str.length(); i++) {
            x=str.charAt(i);
            if (x!=' ') {
                r=x+r;
                aux+=x;
            }            
        }
        if (aux.equalsIgnoreCase(r)) {
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No es un palindromo");
        }
    }    
}
