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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresar un número a evaluar.");
        num=leer.nextInt();
        
        if(num==1){
            System.out.println("El número 1 NO ES PRIMO");            
        }else{
        
        if(primoNoPrimo(num)){
            System.out.println("El número ingresado ES PRIMO");
        }else{
            System.out.println("El número ingresado ES COMPUESTO");
        }}
        
        
    }
    public static boolean primoNoPrimo(int n){
        boolean primo;
        int cont=0;
                     
        if(n!=1){
        
        for (int i = 2; i < n; i++) {
            if(n%i==0){
            cont=cont+1;
            }
        }
        }
        
        
        if(cont==0){
        primo=true;
        }else{
        primo=false;}
        
    return primo;
    }
    
}
