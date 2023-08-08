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
import java.lang.String;
import java.util.Scanner;
public class Cadena {
    
    public static void pressAnyKeyToContinue(){
    String seguir;
    Scanner teclado=new Scanner(System.in);
        System.out.println("Press any key to continue...");
        try{
        seguir=teclado.nextLine();
        }catch (Exception e)
        {}
    }
    
    public static void esperar(){
    try{
    Thread.sleep(5*1000);
    }catch (Exception e){
        System.out.println(e);
    }
    }
    
    public static void limpiarpantalla(){//No Funciona
    try{
    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }catch (Exception e){}
    }
    
    
    
    public static void longitudCadena(String cadena){
        //paso por parametro la cadena ingresada por el usuario
        int num_caracteres=0;
        //declaro la variable donde guardo el resultado
        num_caracteres=(cadena.length());
        
        System.out.println("La longitud de la frase es "+ num_caracteres);
        //devuelve por consola la longitud de la cadena
    }

    

public static String cadenaSubstraccion(Scanner entrada,String cadena){
    //paso por parametro el objeto scanner y la cadena que guarda ese objeto
    int desde=0;
       int hasta=0;
        String cadenaSubstraccion=(" ");
        //declaro las variables que uso en el metodo
    System.out.println("Desde donde quieres cortar la cadena?");
    desde=entrada.nextInt();
    System.out.println("Hasta donde quieres cortar la cadena?");
    hasta=entrada.nextInt();
    //pregunto al usuario desde y hasta donde quiere cortar la cadena
    return cadenaSubstraccion=cadena.substring(desde, hasta);
    
     //retorna la cadena resultante luego del corte   
  } 


    public static int buscarLetra(Scanner entrada, String cadena) {
        int i = 0;
        int contador = 0;
        char letra;
        int posicion=0;
        System.out.println("Que letra queres buscar?");
        letra = entrada.next().charAt(0);
        posicion=cadena.indexOf(letra);
        while(posicion!=-1){
        contador++;
        posicion=cadena.indexOf(letra, posicion+1);
        }
        return contador;
    }
    
    public static void CuadradoAsteriscos () {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la longitud del lado del cuadrado: ");
    int tam = scanner.nextInt(); //tam es el tamaño del cuadrado
    
    int i = 1;
    while (i <= tam) { //filas
      int j = 1;
      while (j <= tam) { // columna
        if (i == 1 || i == tam || j == 1 || j == tam) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
        j++;
      }
      System.out.println();
      i++;
    }
  }   
    
    //Método Torres de Hanoi Recursivo
    public static void Hanoi(int n, int origen,  int auxiliar, int destino){
        if(n==1){
           System.out.println("mover disco de " + origen + " a " + destino);
        }else{
           Hanoi(n-1, origen, destino, auxiliar);
           System.out.println("mover disco de "+ origen + " a " + destino);
           Hanoi(n-1, auxiliar, origen, destino);
        }
    }
    
    
    
    
    
}
    
    

    
  

       
   

    
    



