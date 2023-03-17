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
public class TeoriaEjercicio12 {
    /*Crea un procedimiento EsMultiplo que reciba los dos 
    números pasados por el usuario, validando que el 
    primer número múltiplo del segundo e imprima si 
    el primer número es múltiplo del segundo, sino 
    informe que no lo son.
*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int numA,numB;
        
        System.out.println("Ingresar 2 valores para verificar si el segundo es múltiplo del primero.");
        numA=leer.nextInt();
        numB=leer.nextInt();
        
        verificarMultiplo(numA,numB);
    }
    
    public static void verificarMultiplo(int A, int B){
    
    if (B%A==0){
        System.out.println(B+" ES múltiplo de "+A);
    }else{
        System.out.println(B+" NO ES MULTIPLO DE "+A);
    }
    
    }
}
