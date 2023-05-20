package Metodo;

import Insercion.Insercion_Directa;
import QuickSort.quickSort;
import Selecccion.Ordenaminto_Seleccion;
import burbuja.Burbuja;
import Shell.shell;
import java.util.Scanner;
import javax.swing.JOptionPane;

import static Variables.variables.*;
import metodobusqueda.metodo_busqueda;

public class Operacciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));

        int A[] = new int[elemento];

        for (i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 100); // genera numeros de 0 a 1 se pasa a int
        }
        System.out.println("");
        System.out.println("El arreglo d3esordenado es:");
        for (i = 0; i < elemento; i++) {
            System.out.println("[" + A[i] + "]");
        }

        do {
            System.out.println("Elija el metodo de ordenamiento:");
            System.out.println("\t1. Burbuja:");
            System.out.println("\t2. Seleccion:");
            System.out.println("\t3. Insercion:");
            System.out.println("\t4. Shell");
            System.out.println("\t5. Quicksort");
            System.out.println("\t6. Ackermann");
            System.out.println("\t7. Hanoi");
            System.out.println("\t8. salir:");
            System.out.println("");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    Burbuja.burbuja(A);
                    try {
                        Thread.sleep(700);
                    } catch (Exception e) {

                    }
                    metodo_busqueda.metodobus(A);
                    break;

                case 2:
                    Ordenaminto_Seleccion.seleccion(A);
                     try {
                        Thread.sleep(700);
                    } catch (Exception e) {

                    }
                    metodo_busqueda.metodobus(A);

                    break;
                case 3:
                    Insercion_Directa.insercion(A);
                     try {
                        Thread.sleep(700);
                    } catch (Exception e) {

                    }
                    metodo_busqueda.metodobus(A);

                    break;
                case 4:
                    shell.shell(A);
                     try {
                        Thread.sleep(700);
                    } catch (Exception e) {

                    }
                    metodo_busqueda.metodobus(A);

                    break;
                case 5:
                    quickSort.sort(A);
                     try {
                        Thread.sleep(700);
                    } catch (Exception e) {

                    }
                    metodo_busqueda.metodobus(A);

                    break;
                case 6:
                    Ackermann.ackermann.mostrar(A);
                     try {
                        Thread.sleep(700);
                    } catch (Exception e) {

                    }
                    metodo_busqueda.metodobus(A);

                    break;
                case 7:
                    Hanoi.hanoi.soluccion(A);
                     try {
                        Thread.sleep(700);
                    } catch (Exception e) {

                    }
                    metodo_busqueda.metodobus(A);

                    break;
                default:
                    System.out.println("");

            }
        } while (op <= 7);
        System.out.println("Hasta la proxima:");
    }
}
