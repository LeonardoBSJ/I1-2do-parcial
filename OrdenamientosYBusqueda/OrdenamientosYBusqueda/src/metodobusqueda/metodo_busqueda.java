
package metodobusqueda;

import Busqueda.busqueda;
import static Variables.variables.op;
import busquedaBinaria.Binaria;
import java.util.Scanner;

public class metodo_busqueda {
    public static void metodobus(int A[]){
                        
       Scanner leer = new Scanner(System.in);

        do{
            System.out.println("\tPor que metodo quiere realizar su busqueda");
            System.out.println("1.-  \t Busqueda secuencial:");
            System.out.println("2.- \t Busqueda binaria:");
            System.out.println("3.-\t ninguna busqueda (salir):");
        op=leer.nextInt();
          switch (op) {
              case 1:
                  busqueda.bus(A);
                 break;
              case 2:
                  Binaria.binaria(A);
                  break;
              default:
                  System.out.println(" salio.");
                  break;
          }
        }while(op<=3);
        System.out.println("Salio de la busqueda");
       
    }
}
