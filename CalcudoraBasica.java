/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calcudorabasica;
import java.util.Scanner;

/**
 *
 * @author rdominguez
 */
public class CalcudoraBasica {
    public static boolean isNumeric(String cadena){
        //valida que sea un numero
        cadena = cadena.trim();
        try{
            Integer.parseInt(cadena);
            return true;
        }
        catch(NumberFormatException nf)
        {
            return false;
        }
    }
    
    public static int menu(){
        //Menu de calculadora
        String ent="";
        Scanner entrada = new Scanner(System.in);
        int opc=0;
        System.out.println("MENU");
        System.out.println("1.- MULTI");
        System.out.println("2.- DIV");
        System.out.println("3.- SUMA");
        System.out.println("4.- RESTA");
        System.out.println("5.- Salir");
        System.out.println("ELIGE UNA OPCION: ");
        do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
        opc = Integer.parseInt(ent);
        return opc;
    }
    
    public static void sumar() {
        String ent="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el primer numero: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int num1 = Integer.parseInt(ent);
         
        System.out.println("Dame el segundo numero: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int num2 = Integer.parseInt(ent);
         
         System.out.println("El resultado de la suma es: "+(num1+num2));
    }
    
     public static void restar() {
        String ent="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el primer numero: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int num1 = Integer.parseInt(ent);
         
        System.out.println("Dame el segundo numero: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int num2 = Integer.parseInt(ent);
         
         System.out.println("El resultado de la suma es: "+(num1-num2));
    }
     
    public static void multiplicar() {
        String ent="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el primer numero: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int num1 = Integer.parseInt(ent);
         
        System.out.println("Dame el segundo numero: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int num2 = Integer.parseInt(ent);
         
         System.out.println("El resultado de la multi es: "+(num1*num2));
    }
    
    public static void dividir() {
        String ent="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el primer numero: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int num1 = Integer.parseInt(ent);
         
        System.out.println("Dame el segundo numero: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int num2 = Integer.parseInt(ent);
         
         System.out.println("El resultado de la DIV es: "+(num1/num2));
    }
    
    public static void main(String[] args) {
        int opc=0;
        do{
            opc = menu();
            switch(opc)
            {
                case 1: multiplicar();
                    break;
                case 2: dividir();
                    break;
                case 3: sumar();
                    break;
                case 4: restar();
                    break;
                //PONER LOS CASE DE LAS DEMAS MULTIPLICACIONES
                default: 
                    System.out.println("Opcion no programada");
            }
        }while(opc!=5);
    }
}
