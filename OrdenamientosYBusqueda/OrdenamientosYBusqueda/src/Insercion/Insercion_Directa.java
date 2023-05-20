package Insercion;
import static Variables.variables.*;
public class Insercion_Directa {

    public static void insercion(int A[]) {
        for ( i = 0; i < A.length; i++) {
             lugar = i;
             aux = A[i];
            while ((lugar > 0 && (A[lugar - 1] > aux))) {
                A[lugar] = A[lugar - 1];
                lugar--;
            }
            A[lugar] = aux;
        }
        System.out.println("");
        System.out.println("El Arreglo por insercion de menor a mayor es:");
        for ( int orden: A) {
            System.out.print("[" + orden+ "], ");
             try{
            Thread.sleep(700);
                    }catch(Exception e){
                        
                    }
        }
        
        System.out.println("");
    }

}
