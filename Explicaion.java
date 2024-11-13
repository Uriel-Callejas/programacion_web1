/*
string nulo
String str="";
Srting str=new String(); en este caso es para tratarlo como objeto
 */
package explicaion;

/**
 *
 * @author Sistemas
 */
public class Explicaion {

    public static void main(String[] args) {
        int c=0;
        String str="Hola mundo ",str_1="Hola mundo",str_2="hola";
        int cantidad=str.length(); //devuelve longitud de una cadena 
        System.out.println("Cantidad de caracteres: "+cantidad);
        int posicion=str.indexOf('o'); //devuelve la primera posicion donde encontro el caracter  -- en caso de no entrar el caracter devuelve -1
        System.out.println("posicion de la primera <o> es: "+posicion);
        int posicion_ultima=str.lastIndexOf('o');  //devuelve la ultima posicion donde encontro el caracter -- en caso de no entrar el caracter devuelve -1
        System.out.println("posicion de la ultima <o> es: "+posicion_ultima);
        char x=str.charAt(5);  //siempre hay que definirlo como char, en caso de definirlo como string daria error
        str=str.toUpperCase();  //conviete todo a mayusculas
        System.out.println("En mayusculas: "+str);
        str=str.toLowerCase();  //conviete todo a minusculas
        System.out.println("En minusculas: "+str);
        
        //esto no funciona
        if (str!=str_1) {
            System.out.println("son diferentes");
        }else System.out.println("Las cadenas son iguales");
        
        
        //esto si funciona
        if (str.equals(str_1)) {
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Tambien son diferentes");
        }
        //cantidad de o's
        for (int i = 0; i < str.length(); i++) {
            x=str.charAt(i);
            if (x=='o') {
                c++;
            }
        }
        System.out.println(""+c);
        
        //Ya no considera mayusculas y minusculas
        if (str.equalsIgnoreCase(str_1)) {  
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Tambien son diferentes");
        }
        int h;
        h = str.compareToIgnoreCase(str_1);
        System.out.println("El valor es: "+h);
        System.out.println("Resultado: "+str.substring(2, 3));
        for (int i = 0; i < str_2.length(); i++) {
            System.out.println(""+str_2.substring(i));
        }
        String y=str_2.concat(str);
        System.out.println("Contatenar: "+y);
        y=y.replace("o", "u");
        System.out.println("Remplazando o por u: "+y);
        y="hola que tal";
        y=y.trim();   //elimina espacios
        System.out.println("Sin espacios: "+y);
        String r="";
        for (int i = 0; i < str.length(); i++) {
            y=str.substring(i, i+1);
            if (!y.equals(" ")) {
                r=r+y;
            }
        }
        System.out.println("sin espacios: "+r);
        r="";
        for (int i = 0; i < str.length(); i++) {
            x=str.charAt(i);
            if (x!=' ') {
                r+=x;
            }
        }
        System.out.println("sin espacios: "+r);
    }    
}
