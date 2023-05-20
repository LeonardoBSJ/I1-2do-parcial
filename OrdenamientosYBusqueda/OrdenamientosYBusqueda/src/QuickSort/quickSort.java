
package QuickSort;
import static Variables.variables.*;
public class quickSort {
    public static void sort(int A[]){
        quicksort(A,0,A.length-1);
        System.out.println("El arreglo ordenado por quick sort es:");
        for(int orden: A){
            System.out.print("["+orden+"], ");
             try{
            Thread.sleep(700);
                    }catch(Exception e){
                        
                    }
        }
        System.out.println("");
    }
    
    public static void quicksort(int A[],int izquierda,int derecha){
        if (izquierda<derecha){
            int pivote=part(A, izquierda, derecha);
            quicksort(A,izquierda, pivote-1);
            quicksort(A,pivote+1,derecha);
            
        }
    }
    
    public static int part(int A[],int izquierda,int derecha){
        int pivote = A[derecha];
         i=izquierda-1;
         for(j=izquierda;j<derecha;j++){
            if(A[j]<pivote){
                i++;
                int t=A[i];
                A[i]=A[j];
                A[j]=t;
            } 
         }
         int t=A[i+1];
         A[i+1]=A[derecha];
         A[derecha]=t;
         return i+1;
         
    }
     
    
}
