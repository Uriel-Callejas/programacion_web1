/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_5;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String str=sc.nextLine(),res="";
        char x;
        for (int i = 0; i < str.length(); i++) {
            x=str.charAt(i);
            if (i%2!=0) {
                res+=x;
            }
        }
        System.out.println("Nuevo texto: "+res);    
    }
    
}
