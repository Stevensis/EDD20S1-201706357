/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_tarea2java;

import java.util.Scanner;

/**
 *
 * @author aaron
 */
public class Edd_Tarea2Java {
    static Scanner sc = new Scanner(System.in);
    static boolean v=true;
    static Implementacion imp = new Implementacion();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("Welcome to Sis assistant");
        do{
            menu();
        }while(v);
    }
    
    public static void menu(){
        System.out.println("Select an option");
        System.out.println("");
        System.out.println("1. Crear Moneda");
        System.out.println("2. Ver monedero");
        System.out.println("3. Crear Propietario");
        System.out.println("4. Ver Propietarios");
        System.out.println("5. Buscar Propietario");
        System.out.println("6. Trasnferencia monedro-propietario");
        System.out.println("7. Trasnferencia propietario-propietario");
        System.out.println("8. Ver monedas");
        System.out.println("9. Salir");
        try{
        int option=sc.nextInt(); 
            seleccion(option);
        }catch(Exception e){
            System.out.println("Debe escribir solo numeros enteros");
        }
        
    }
    
    static public void seleccion(int op){
        switch(op){
            case 1:
                imp.crearMoneda();
                break;
            case 2: 
                imp.verMonedero();
                break;
            case 3:
                imp.crearPropietario();
                break;
            case 4:
                imp.verPropietarios();
                break;
            case 5: 
                imp.searchPropietario();
                break;
            case 6:
                imp.trasmferirMP();
                break;
            case 7:
                imp.transferirPP();
                break;
            case 8:
                
                break;
            case 9: 
                v=false;
                break;
            default:
                System.out.println( "Ingrese alguna opcion valida");
                break;
        }
        System.out.println("");
    }
    
    
}
