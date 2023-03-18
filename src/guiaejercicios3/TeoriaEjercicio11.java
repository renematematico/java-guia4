/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaejercicios3;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class TeoriaEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner leer=new Scanner(System.in);
        int longitud;
        
        do {
        System.out.println("Ingresar una palabra o frase a codificar que termine con punto.");
        frase=leer.nextLine();
        longitud=frase.length();
        } while (!frase.substring(longitud-1,longitud).equals("."));
        
        //Comprueba el último caracter de la frase.
        //while(!frase.endsWith("."));
        
        
        //Mostramos el último caracter de la frase para corroborar que sea punto
        //System.out.println(frase.substring(longitud-1,longitud));
        
        //23-02-07 - CLASE 15-16\EJERCICIOS4
        codificar (frase,longitud);
    }
    
    public static void codificar(String f,int l){
        
        for (int i = 1; i < l; i++) {
            //letra=f.substring(i-1,i);
            //System.out.println(letra);
            switch (f.substring(i-1,i)){
                case "a": System.out.print("@");
                break;
                case "e": System.out.print("#");
                break;
                case "i": System.out.print("$");
                break;
                case "o": System.out.print("%");
                break;
                case "u": System.out.print("*");
                break;
                default: System.out.print(f.substring(i-1,i));
                break;
            }
        }
        System.out.println("");
    }
    
}
