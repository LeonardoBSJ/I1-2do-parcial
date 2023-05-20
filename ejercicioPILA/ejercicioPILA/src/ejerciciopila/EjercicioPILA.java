package ejerciciopila;

import Operacciones.Agregar;
import Operacciones.Buscar;
import Operacciones.Eliminar;
import Tamaño_pila.tamaño_pila;
import Tamaño_pila.tamaño_pila_llena;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static Variabl.variabl.*;

public class EjercicioPILA {

    public static void main(){
        Scanner leer = new Scanner(System.in);

        elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la pila"));

        int B[] = new int[elemento];
        System.out.println("\tSELECCIONA COMO QUIERE LA PILA");
        System.out.println("\t1.-Vacio");
        System.out.println("\t2.-Llena");

        op = leer.nextInt();

        switch (op) {

            case 1:
                tamaño_pila.tamaño_pila(B);
                System.out.println("");
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Agregar.agregarfin(B);
                System.out.println("");
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Buscar.buscar(B);
                System.out.println("");
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Eliminar.eliminar(B);
                System.out.println("");
                break;
            case 2:
                tamaño_pila_llena.llena(B);
                System.out.println("");
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Agregar.agregarfin(B);
                System.out.println("");
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Buscar.buscar(B);
                System.out.println("");
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Eliminar.eliminar(B);
                System.out.println("");
                break;
            default:
                break;
        }

    }
}
