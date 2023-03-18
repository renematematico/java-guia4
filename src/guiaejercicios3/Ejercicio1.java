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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numA, numB,opc;
        boolean menu=true;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("        CALCULADORA");
        System.out.println("Ingresar 2 números para trabajar.");
        numA=leer.nextInt();
        numB=leer.nextInt();
        do {
        System.out.println("          OPERACIONES");
        System.out.println("Seleccionar una operación para realizar");
        System.out.println("(1)- SUMAR");
        System.out.println("(2)- RESTAR");
        System.out.println("(3)- MULTIPLICAR");
        System.out.println("(4)- DIVIDIR");
        System.out.println("(5)- SALIR");
        opc=leer.nextInt();
        
        switch(opc){
            case 1: 
                System.out.println("====================");
                System.out.println("La suma es "+sumar(numA,numB));
            break;
            case 2: 
                System.out.println("====================");
                System.out.println("La resta es "+restar(numA,numB));
            break;
            case 3: 
                System.out.println("====================");
                System.out.println("El producto es "+multiplicar(numA,numB));
            break;
            case 4: 
                System.out.println("====================");
                System.out.println("La división es "+dividir(numA,numB));
            break;
            case 5: 
                System.out.println("====================");
                System.out.println(" PROGRAMA TERMINADO");
                System.out.println("====================");
                menu=false;
            break;
            default: System.out.println("Ingresaste una opción incorrecta.");
        }
            
        } while (menu==true);
        
        
        
        
    }
    
    ////////////////////// - SUBPROCESOS SUMA - /////////////////////
    public static int sumar(int A,int B){
    int suma = A+B;        
    return suma;
    }
    ////////////////////// - SUBPROCESOS RESTA - /////////////////////
    public static int restar(int A,int B){
    int resta = A-B;        
    return resta;
    }
    ////////////////////// - SUBPROCESOS PRODUCTO - /////////////////////
    public static int multiplicar(int A,int B){
    int prod = A*B;        
    return prod;
    }
    ////////////////////// - SUBPROCESOS DIVISIÓN - /////////////////////
    public static float dividir(float A,float B){
    float div = A/B;        
    return div;
    }
}
