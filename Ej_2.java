/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_2;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String str=sc.nextLine();
        str=str.toLowerCase();
        str=str.replace("a", ".");
        str=str.replace("e", ".");
        str=str.replace("i", ".");
        str=str.replace("o", ".");
        str=str.replace("u", ".");
        System.out.println("Nuevo texto: "+str);
    }
    
}
