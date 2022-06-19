/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcd;

import java.util.Scanner;

/**
 *
 * @author rdominguez
 */
public class Mcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese primer numero:");
        num1=teclado.nextInt();
        System.out.println("Ingrese segundo numero:");
        num2=teclado.nextInt();
        
        while(num1 != num2)
            if(num1>num2){
                num1 =num1-num2;
            }
            else
                num2= num2 - num1;
                
            System.out.println("El MCD es: "+num1);
    }
    
}
