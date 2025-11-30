package PROVA;

import java.util.ArrayList;

public class UtilExamen {
    public static int[] arrayListToArray(ArrayList<Integer> ArrayList){
        int[] array = new int[ArrayList.size()];
        int i = 0;
        for (int valor : ArrayList){
            array[i++] = valor;
        }
        return array;
    }
    
    public static ArrayList<Integer> arrayToArrayList(int[] array){
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int a : array) {
            arrayList.add(a);
        }
        
        return arrayList;
    }
    
    public static void mostraArrayListInt(ArrayList<Integer> ArrayList){
        System.out.print(" [ ");
        for (int i : ArrayList){
            System.out.print(i + " ");
        }
        System.out.print(" ] ");
    }
    public static ArrayList<Integer> obteRepetits(int[] array1, int[] array2){
        ArrayList<Integer> repetits = new ArrayList<Integer>();
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    repetits.add(array2[j]);  // CORRECCIÓ: te falta 'break' per a no repetir els valors
                }
            }
        }
        
        return repetits;
    }
    
    public static ArrayList<Integer> ordenaArray(int[] array){
        ArrayList<Integer> ordenat = new ArrayList<>();
        boolean insertado=false;
        for (int i = 0; i < array.length; i++) {
            insertado=false;
            for(int j = 0; j < ordenat.size(); j++) {
                if (array[i] < ordenat.get(j)) {
                    ordenat.add(j,array[i]);
                    insertado=true;
                    break;
                }
                
            }
            if(!insertado ) {
                ordenat.add(array[i]);
            }
        }
        return ordenat;
    }
    
    public static ArrayList<Integer> obteRepetitsOrdenat(int[] array1, int[] array2){
        ArrayList<Integer> RepOrd = new ArrayList<>();   
        
        boolean repetido;
        for(int i = 0; i < array1.length; i++){  // CORRECCIÓ: deberias usar los metodos anteriormente creados
            repetido = false;
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    RepOrd.add(array2[j]);
                }
                if(!repetido){
                RepOrd.add(array1[i]);
                break;
                }
                if (array1[i] < RepOrd.get(j)){
                    RepOrd.add(j, array1[i]);
                    repetido = true;
                    break;
                }
            }
        }
        return RepOrd;
    }
}
