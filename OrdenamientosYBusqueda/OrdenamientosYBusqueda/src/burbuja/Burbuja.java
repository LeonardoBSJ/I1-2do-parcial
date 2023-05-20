package burbuja;

import static Variables.variables.*;

public class Burbuja {

    public static void burbuja(int A[]) {

        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A.length - 1; j++) {// se compara a si mismo

                if (A[j] > A[j + 1]) {

                    aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                }
            }
        }
        System.out.println("el arreglo por Burbuja ordenado es:");
        for (int orden : A) {
            System.out.print("[" + orden + "], ");
            try {
                Thread.sleep(700);
            } catch (Exception e) {

            }
        }
        System.out.println("");
        
    }

   
}
