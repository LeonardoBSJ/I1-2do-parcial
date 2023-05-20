
package Operacciones;

import static Variabl.variabl.aux;
import static Variabl.variabl.i;
import java.util.Scanner;
public class Eliminar {
      public static int eliminar(int B[],int i){
        Scanner leer = new Scanner (System.in);
        System.out.println("Quieres eliminar un dato (true o false");
        boolean bus=leer.nextBoolean();
        
        if (bus==true){
            for(i=0;i<B.length-1;i++){
                 
               aux=B.length-1; 
            }
        }else if (bus==false){
         
           
    }
         return i--;
    }
    public static void eliminar(int B[]){
       
        int val=eliminar(B,aux);
        if(val==B.length-1){
            System.out.println("La pila con elemento eliminado es:");
           for( i=0;i<aux;i++){
               System.out.println("["+B[i]+"]");
           }  
        }else {
             System.out.println("La pila es:");
           for( i=0;i<B.length;i++){
               System.out.println("["+B[i]+"]");
        }
            
        
    }
    }
}
