/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author marcelaaliciaarroyo
 */
import java.util.Scanner;
import javax.swing.*;

public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        formulario formulario1 = new formulario();
        formulario1.setBounds(0, 0,400,300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);

     
        /* String nombre = "";
         nombre = JOptionPane.showInputDialog("Escribe tu nombre"); 
         //crea una interfaz grafica para completar el nombre
         String msg = "Hola " + nombre + "!";
         JOptionPane.showMessageDialog(null, msg); */                                                               
     //}
}
   
       /* Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = entrada.nextInt();
        Cadena.Hanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino                                                        
    }*/
        
        /*Scanner entrada=new Scanner(System.in);
        String cadena=(" ");
        
        System.out.println("Ingresa una frase");
        cadena=entrada.nextLine();
        //hasta aca se le pide al usuario que ingrese una frase y se guarda en cadena
        Cadena.longitudCadena(cadena);
        //invoco al metodo longitudCadena desde la clase cadena no creo
        //un objeto porque el metodo es static
        System.out.println(" ");
        System.out.println("La cadena queda " + Cadena.cadenaSubstraccion(entrada, cadena));
       //invoco al metodocadenaSubstraccion con un print 
       //entrada (objeto Scanner) y cadena(variable donde guardo lo que entra el 
    //usuario) es lo que paso y recibo por parametro
        System.out.println(" ");
        System.out.println("La letra se repite " + Cadena.buscarLetra(entrada, cadena) +" veces");
        System.out.println("La frase pasada a mayusculas es "+ cadena.toUpperCase());
    System.out.println("La frase pasada a minusculas  es "+ cadena.toLowerCase());
        System.out.println("la frase sin espacios vacios es " +cadena.trim());
    }*/

    //Cadena.CuadradoAsteriscos();
    //Cadena.preeAnyKeyToContinue();
    //Cadena.esperar();
   
}
