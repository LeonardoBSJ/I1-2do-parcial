
package Shell;
import static Variables.variables.*;
public class shell {
  
    public static void shell(int A[]){
     
       int salto=A.length/2;
        boolean cambio;
      
      for(salto=A.length/2;salto !=0;salto/=2){
        cambio=true;
        
        while(cambio){
            cambio=false;
            for(i=salto;i<A.length;i++){
                if(A[i-salto]>A[i]){
                    aux=A[i];
                    A[i]=A[i-salto];
                    A[i-salto]=aux;
                }
                System.out.println("");
            }
        }
      }         
      System.out.println("el arreglo ordenado por shell es:");

      for ( int orden: A) {
            System.out.print("[" + orden + "], ");
             try{
            Thread.sleep(700);
                    }catch(Exception e){
                        
                    }
      }
        System.out.println("");
  }  
}
