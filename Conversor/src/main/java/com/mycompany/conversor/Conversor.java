package com.mycompany.conversor;

import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author Diana
 */
public class Conversor{ 
                

    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      
      double cantidadMonedaLocal, divisa,tasaCambio , miDouble; 
      String monedaLocal, monedaCambio, prueba;
      
  
      
      System.out.println("Ingrese moneda que desea cambiar");
      monedaLocal=scan.nextLine();
      
      System.out.println("Ingrese cantidad de moneda a cambiar");
      cantidadMonedaLocal=scan.nextDouble();
      
      System.out.println("Ingresa la tasa de cambio");
      tasaCambio=scan.nextDouble();
      
      divisa=cantidadMonedaLocal*tasaCambio;
      
      scan.close();
      
      System.out.println(monedaLocal +" "+ "Equivale a " + divisa);
      
      prueba=JOptionPane.showInputDialog("Ingrese un valor");
       
                  
    }
}
