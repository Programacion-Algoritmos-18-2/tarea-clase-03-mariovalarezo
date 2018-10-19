/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        double sueldoA[]= new double[4]; 
        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();
        
        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();
        
        if(numero_nombres==1){
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        }else{
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);      
        }
        
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        System.out.println("Desea ingresar el sueldo mensual (1) o por semana (2)");
        int num= scanner.nextInt();
        switch(num){
            case 1: 
        System.out.println("Ingrese el sueldo del trabajador");
        double sueldo = scanner.nextDouble();
        t.agregar_sueldo(sueldo);
        break;
            case 2:
                for (int i = 0; i < 4; i++) {
                    System.out.println("Ingrese el sueldo de la semana: " +(i+1));
                    sueldoA[i] = scanner.nextDouble();                                       
                }
                t.agregar_sueldo(sueldoA);
    }
        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());
        
                
    }
}
