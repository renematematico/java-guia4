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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre,opc;
        int edad;
        Scanner leer=new Scanner(System.in);
        boolean menu=true,mayorMenor;
        
        do {
        System.out.println("Ingrese el nombre");
        nombre=leer.next();
        System.out.println("Ingrese la edad de la persona");
        edad=leer.nextInt();
        
        mayorMenor=verificarEdad(nombre,edad);
        
        if(mayorMenor){
            System.out.println("=========================");
            System.out.println(nombre+" es mayor de edad.");
            System.out.println("=========================");
        }else{
            System.out.println("=========================");
            System.out.println(nombre+" es menor de edad.");
            System.out.println("=========================");
        }
        
        System.out.println("¿Desea ingresar otra persona? SI/NO");
        opc=leer.next();
        
        if(opc.equalsIgnoreCase("no")){
        menu=false;
        }else if(opc.equalsIgnoreCase("si")){
        menu=true;
        }
        
        } while (menu==true);
        System.out.println("==================");
        System.out.println("PROGRAMA TERMINADO");
        System.out.println("==================");
        
    }
    public static boolean verificarEdad(String n, int e){
    boolean verificador;
        if (e>=18){
        verificador=true;
    }else{
        verificador=false;
    }
    return verificador;
    }
}
