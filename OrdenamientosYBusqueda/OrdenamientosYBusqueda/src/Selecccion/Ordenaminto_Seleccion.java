package Selecccion;

import static Variables.variables.*;

public class Ordenaminto_Seleccion {

    public static void seleccion(int A[]) {

        for (i = 0; i < A.length; i++) {
            minimo = i;//minimo valor
            for (j = i; j < A.length; j++) {
                if (A[j] < A[minimo]) {
                    minimo = j;
                }
            }
            aux = A[i];
            A[i] = A[minimo];
            A[minimo] = aux;
        }
        System.out.println("");
        System.out.println("El arreglo por seleccion de menor a mayor es;");
        for (int orden: A) {
            System.out.print("[" + orden + "], ");
            try {
                Thread.sleep(700);
            } catch (Exception e) {

            }

        }
        System.out.println("");
    }
}
