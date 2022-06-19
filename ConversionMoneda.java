/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversionmoneda;

import java.util.Scanner;

/**
 *
 * @author rdominguez
 */
public class ConversionMoneda {

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
        System.out.println("Conversion de Divisas");
        System.out.println("1.- Euros");
        System.out.println("2.- Libras");
        System.out.println("3.- Yenes");
        System.out.println("4.- Dolares");
        System.out.println("5.- Salir");
        System.out.println("ELIGE UNA OPCION: ");
       
        do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
        opc = Integer.parseInt(ent);
        return opc;
    }
     
     //Euro hoy 18/06/2022
    public static void Euro() {
        String ent="";
        double euro=21.37;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa cantidad en pesos: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int pesos = Integer.parseInt(ent);
         
         System.out.println("La cantidad de "+pesos+"$, en Euros es igual a: "+pesos*euro);
    }
    
    //Libra hoy 18/06/2022
    public static void Libra() {
        String ent="";
        double libra=24.87;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa cantidad en pesos: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int pesos = Integer.parseInt(ent);
         
         System.out.println("La cantidad de "+pesos+"$, en Libras es igual a: "+pesos*libra);
    }
    
    //Yenes hoy 18/06/2022
    public static void Yenes() {
        String ent="";
        double yen=0.15;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa cantidad en pesos: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int pesos = Integer.parseInt(ent);
         
         System.out.println("La cantidad de "+pesos+"$, en Yenes es igual a: "+pesos*yen);
    }
    
    //Dolar hoy 18/06/2022
    public static void Dolar() {
        String ent="";
        double dolar=20.34;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa cantidad en pesos: ");
         do{
            ent = entrada.nextLine();
        }while(!isNumeric(ent));
         int pesos = Integer.parseInt(ent);
         
         System.out.println("La cantidad de "+pesos+"$, en Dolares es igual a: "+pesos*dolar);
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        /*monedaInterfaz obj = new monedaInterfaz();
        obj.setVisible(true);*/
        int opc=0;
        do{
            opc = menu();
            switch(opc)
            {
                case 1: Euro();
                    break;
                case 2: Libra();
                    break;
                case 3: Yenes();
                    break;
                case 4: Dolar();
                    break;
                default: 
                    System.out.println("Opcion no programada");
            }
        }while(opc!=5);
    }
    
}
