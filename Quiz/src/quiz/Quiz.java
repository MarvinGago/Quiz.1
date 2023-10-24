/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author CPUw1010
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
       System.out.println("ingrese la cantidad de empleados: ");
       int cantidadEmpleados= scanner.nextInt();
       double montoTotalCCSS=0;
       
       for(int i =1; i<= cantidadEmpleados; i++) {
           System.out.println("Ingrese el salario del empleado" + i + ":");
           double salario = scanner.nextDouble();
           double montoSEM = salario * 0.0925;
           double montoIVM = salario * 0.0508;
           
           montoTotalCCSS += montoSEM + montoIVM;         
       }
        System.out.println("La empresa debera abonar a la CCSS el monto de:" + montoTotalCCSS +" por el concepto de SEM y IVM.");
        
    }
    
}
