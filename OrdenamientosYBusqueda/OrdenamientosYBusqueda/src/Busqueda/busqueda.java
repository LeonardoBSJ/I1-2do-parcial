
package Busqueda;
import static Variables.variables.*;
import java.util.Scanner;
public class busqueda { 
  
    public static void bus(int A[]){       
     Scanner leer = new Scanner(System.in);
        System.out.println("ingresa el numero que desea buscar");
     int bus = leer.nextInt();
        int val = busqued(A,bus);
        if (val == -1) {
            
            System.out.println("el numero:" + bus + "no se encuentra");

        } else {
            
            System.out.println("el numero: " + bus + " se enecuentra en el lugar: " +val+ " del arreglo");
        } 
    }
        public static int busqued(int A[],int bus){
       
        for (i = 0; i < A.length; i++) {
            if (A[i] == bus) {
               

                return i;
            }

        }
        return -1;
    }

    }

