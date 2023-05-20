
package ackermann_de_un_numero;
import java.util.Scanner;
public class Ackermann_de_un_numero {
     public static int v(int m, int n){
        if (m==0){
            return n+1;
        }else if (n==0){
            return v(m-1,1);
        }
        else {
            return v(m-1,v(m,n-1));
        }
    }
    public static void main(String[] args) {
       
        Scanner leer= new Scanner (System.in);
        System.out.println("Introducir su primer numero");
        int m=leer.nextInt();
        System.out.println("Introducir su segundo valor");
        int n=leer.nextInt();
        int val=v(m,n);
        System.out.println("el ackermann de: "+m+" "+n+" es; "+val);
        
    }
    
}
