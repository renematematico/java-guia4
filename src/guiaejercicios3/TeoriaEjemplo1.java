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
public class TeoriaEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numA,numB;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar 2 números para sumar.");
        numA=leer.nextInt();
        numB=leer.nextInt();
        
        int retorno=sumar(numA,numB);
        System.out.println("La suma de ambos números es: "+retorno);
        
        String nombre="Mariano";
        int edad = 29;
        
        mostrarInfo(nombre,edad);
        
        
    }
    
    public static int sumar (int A, int B){
    int suma = A + B;
        return suma;
    }
    
    /*Los parámetros que recibe un procedimiento se pueden nombrar
    de manera local con variables que nada tienen que ver con las
    variables dentro del algoritmo principal.*/
    public static void mostrarInfo(String n, int e){
        System.out.println("El nombre del usuario es: "+n+" y su edad: "+e);
    }
}
