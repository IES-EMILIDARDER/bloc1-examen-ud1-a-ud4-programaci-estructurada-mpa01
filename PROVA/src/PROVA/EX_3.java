package PROVA;

import java.util.ArrayList;

public class EX_3 {
    public static void main(String[] args) {
        int[] array;  // 'array' de 5 posicions amb valors aleatoris entre 0 i 9
        ArrayList<Integer> resultat;  // 'arraylist' resultant
        
        // Genera un array de 10 posicions amb números aleatoris entre 0 i 9
        array = UtilitatsArrays.generaArray(10, 0, 9);
        UtilitatsArrays.mostraArray(array);
        // Calcula l''ArrayList' emprant el mètode 'ordenaArray' 
        resultat = UtilExamen.ordenaArray(array);
        // Mostra l''ArrayList' resultant
        UtilExamen.mostraArrayListInt(resultat);
    }
}

