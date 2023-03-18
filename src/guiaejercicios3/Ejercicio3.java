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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double euro;
        String moneda;
        Scanner leer=new Scanner(System.in);
     
        
        System.out.println("CONVERTIDOR DE MONEDA");
        System.out.println("Indique la cantidad de Euros a convertir.");
        euro=leer.nextDouble();
        System.out.println("Indique a qué moneda desea convertir.");
        System.out.println("Libras");
        System.out.println("Dolares");
        System.out.println("Yenes");
        moneda=leer.next();
        moneda=moneda.toLowerCase();
        
        convertidor(euro,moneda);
        
    }
    
    public static void convertidor(double e,String m){
    
        switch(m){
            case "libras": System.out.println(e+"€ = "+e*0.86+" Libras.");
            break;
            case "dolares": System.out.println(e+"€ = "+e*1.28611+" Dólares.");
            break;
            case "yenes": System.out.println(e+"€ = "+e*129.852+" Yenes.");
            break;
            default: System.out.println("La moneda ingresada no es la esperada");
        }
        
    }
    
}
