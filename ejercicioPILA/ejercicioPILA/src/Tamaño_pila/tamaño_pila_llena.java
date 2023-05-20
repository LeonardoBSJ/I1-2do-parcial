
package Tamaño_pila;
import static Variabl.variabl.*;
public class tamaño_pila_llena {
    public static void llena(int B[]){
         for ( i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 100); // genera numeros de 0 a 1 se pasa a int
        }
        System.out.println("");
        System.out.println("La pila desordenado es:");
        for ( i = 0; i < B.length; i++) {
            System.out.println("[" + B[i] + "]");
        }
        System.out.println("");
         for ( int i = 0; i < B.length; i++) {
              lugar = i;
              aux = B[i];
            while ((lugar > 0 && (B[lugar - 1] > aux))) {
                B[lugar] = B[lugar - 1];
                lugar--;
            }
            B[lugar] = aux;
        }
        System.out.println("");
        System.out.println("La Pila por insercion de menor a mayor es:");
        for ( int orden:  B) {
            System.out.println("[" + orden+ "] ");
             try{
            Thread.sleep(700);
                    }catch(Exception e){
                        
                    }
        }
        
        System.out.println("");
    }
    
}
