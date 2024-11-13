/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_7;

import java.util.Scanner;

/**
 *
 * @author Sistemas
 */
public class Ej_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String str=sc.nextLine(),res="";
        str=str.toLowerCase();
        char x;
        for (int i = 0; i < str.length(); i++) {
            x=str.charAt(i);
            switch (x){
                case ('a'):
                    break;
                case ('e'):
                    break;
                case ('i'):
                    break;
                case ('o'):
                    break;
                case ('u'):
                    break;
                default:
                    res+=x;
                    break;
            }
        }
        System.out.println("Nuevo texto: ");
        System.out.println(res);
    }
    
}
