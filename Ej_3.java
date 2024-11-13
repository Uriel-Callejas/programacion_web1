/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_3;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String str=sc.nextLine(),res="";
        char x;
        int contador=0;
        for (int i = 0; i < str.length(); i++) {
            x=str.charAt(i);
            if (x!=' ') {
                res+=x;
                contador++;
            }else{
                System.out.println(res+" -> "+contador);
                res="";
                contador=0;
            }
        }
        System.out.println(res+" -> "+contador);
                res="";
                contador=0;
    }
    
}
