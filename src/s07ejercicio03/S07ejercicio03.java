/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio03;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class S07ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creando un nuevo objeto Scanner
        Scanner input = new Scanner(System.in);
        
        //Mostrar el mesaje al usuario
        System.out.println("INGRESAR UN NUMERO ENTRE 0 Y 1000: ");
        int number = input.nextInt();
        
        //Calcular la suma de los digitos del numero entero
        int menorQue10 = number % 10;
        number = number /10;
        int decenas = number % 10;
        number /=10;
        int centenas = number % 10;
        number /=10;
        int suma = centenas + decenas + menorQue10;
        
        //Mostrar resultado
        System.out.println("LA SUMA DE LOS DIGITOS ES: " + suma);
        
        
        
        
        
        
        
    }
    
}
