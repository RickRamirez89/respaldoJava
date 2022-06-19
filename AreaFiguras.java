/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areafiguras;

import java.util.Scanner;

/**
 *
 * @author rdominguez
 */
public class AreaFiguras {

    /**
     * @param args the command line arguments
     */
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
        System.out.println("Obtener Area de figuras");
        System.out.println("1.- Circulo");
        System.out.println("2.- Cuadrado");
        System.out.println("3.- Rectangulo");
        System.out.println("4.- Triangulo");
        System.out.println("5.- Salir");
        System.out.println("ELIGE UNA OPCION: ");
       
        do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
        opc = Integer.parseInt(ent);
        return opc;
    }
    //OBTENER AREA
    public static void Circulo() {
        String ent="";
        double pi=3.1416;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el radio del circulo: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int radio = Integer.parseInt(ent);
         
         System.out.println("El area del circulo es: "+(pi*radio));
    }
    
    public static void Cuadrado() {
        String ent="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa lado uno: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int lado1 = Integer.parseInt(ent);
         
        System.out.println("Ingresa lado dos: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int lado2 = Integer.parseInt(ent);
         
         System.out.println("El area del cuadrado es: "+(lado1*lado2));
    }
    
    public static void Rectangulo() {
        String ent="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa la base: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int base = Integer.parseInt(ent);
         
        System.out.println("Ingresa la altura: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int altura = Integer.parseInt(ent);
         
         System.out.println("El area del rectangulo es: "+(base*altura));
    }
    
    public static void Triangulo() {
        String ent="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa la base: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int base = Integer.parseInt(ent);
         
        System.out.println("Ingresa la altura: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int altura = Integer.parseInt(ent);
         
         System.out.println("El area del triangulo es: "+(base*altura)/2);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opc=0;
        do{
            opc = menu();
            switch(opc)
            {
                case 1: Circulo();
                    break;
                case 2: Cuadrado();
                    break;
                case 3: Rectangulo();
                    break;
                case 4: Triangulo();
                    break;
                default: 
                    System.out.println("Opcion no programada");
            }
        }while(opc!=5);
    }
    
}
