package PROVA;

import PROVA.UtilExamen;
import java.util.ArrayList;


public class EX_1 {
    public static void main(String[] args) {
        int[] array;  // 'array' de 5 posicions amb valors aleatoris entre 0 i 9
        ArrayList<Integer> arrayL = new ArrayList<>();  // 'arraylist' resultant
        
        // Crea un 'Array' de 5 posicions amb números aleatoris entre 0 i 9
        array = UtilitatsArrays.generaArray(5, 0, 9);
        // Calcula l''ArrayList' emprant el mètode 'arrayToArrayList' 
        arrayL = UtilExamen.arrayToArrayList(array);
        // Mostra l''ArrayList' resultat emprant el mètode 'mostraArrayListInt' 
        UtilExamen.mostraArrayListInt(arrayL);
    }
}

