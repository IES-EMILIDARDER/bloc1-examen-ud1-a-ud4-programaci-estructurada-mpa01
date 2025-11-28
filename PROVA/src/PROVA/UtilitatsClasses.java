package PROVA;

import java.util.ArrayList;

/**
 *
 * @author winadmin
 */
public class UtilitatsClasses {
        
    /**
     *
     * @param array
     */
    public static void mostrarArrayListInt(ArrayList<Integer> array) {
        System.out.print("[ ");
        for (Integer a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }
    
        public static void mostrarArrayListStr(ArrayList<String> array) {
        System.out.print("[ ");
        for (String a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }

    /**
     * Crear un ArraList 
     *      s'avalua cada element de l'array en l'ArrayList
     * @return ArrayList 
     */    
    public static ArrayList<Integer> mostrarDiferents(int[] array) {
        ArrayList<Integer> resultat = new ArrayList<>();
        
        for (Integer num: array) {
            if (! resultat.contains(num)) // si 'num' no es troba en 'resultat', s'afegeix
                resultat.add(num);		
        }
        return resultat;
    }
    
    /**
     * Transforma un int[] a un ArrayList<Integer>
     * @param array --> int[]
     * @return ArrayList<Integer>
     */
    public static ArrayList<Integer> arrayToArrayListInt(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int a : array) {
            arrayList.add(a);
        }
        
        return arrayList;
    }
    
    /**
    * Crear un ArrayList 
    *      s'avalua cada element de l'array en l'ArrayList
    *      si l'ArrayList es manté ordenat es poden estalviar 
    *      moltes lectures
    * @return ArrayList ordenat
    */
    public static ArrayList<Integer> mostrarDiferentsMillorat(int[] array) {
        ArrayList<Integer> resultat = new ArrayList<>();
        
        for (int num : array) {
            int i = 0; // index on cal insertar en 'resultat'
            boolean trobat = false;
            
            for (Integer r : resultat) { // es cerca 'num' dins 'resultat'
                if( r == num) { // trobat, no cal insertar
                    trobat = true;
                    break;
                } else if (r > num) // no trobat, ni es trobar� si l'ArrayList es mant� ordenat, cal insertar
                    break;
                else // seguir cercant dins 'resultat'
                    i++;
            }
            if (!trobat) // afegir 'num' en la posici� 'i' per mantenir l'ArrayList ordenat
                resultat.add(i,num);
        }
        
        return resultat;
    }
    
    public static ArrayList<Integer> generaDiferents(int[] array) {
        ArrayList<Integer> diferents = new ArrayList<>();
        boolean repetido;
        for(int i = 0; i < array.length; i++){
            repetido = false;
            for( int j = 0; j < diferents.size(); j++){
                if(diferents.get(j).equals(array[i]) ){
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                diferents.add(array[i]);
            }
        }
        return diferents;
    }
    
    public static ArrayList<Integer> ordenaArrays (int[] array) {
        ArrayList<Integer> ordenat = new ArrayList<>();
        ordenat.add(array[0]);
        boolean insertado = false;
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
    
    
    public static ArrayList<Integer> ordenaArraySenseRepeticions (int[] array){
        ArrayList<Integer> no_rep = new ArrayList<>();
        boolean rep_diff;
        for (int i = 0; i < array.length; i++) {
            rep_diff=false;

            for(int j = 0; j < no_rep.size(); j++) {
                if (array[i] < no_rep.get(j)) {
                    no_rep.add(j,array[i]);
                    rep_diff=true;
                    break;
                } 
                if(no_rep.get(j).equals(array[i]) ){
                    rep_diff = true;
                    break;
                }
                
            }
            if(!rep_diff) {
                no_rep.add(array[i]);
            }
        }
        return no_rep;
    }
    
    public static ArrayList<Integer> obteParells(int[] array) {
        ArrayList<Integer> parells = new ArrayList<>();
        
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0) {
                parells.add(array[i]);
            }
        }
        
        return parells;
    }

    public static ArrayList<Integer> obteParellsOrdenat(int[] array) {
        ArrayList<Integer> parOrd = new ArrayList<>();
        boolean ordenado; 
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                ordenado = false;
            for(int j = 0; j < parOrd.size(); j++){
                if(array[i] < parOrd.get(j)){
                    parOrd.add(j, array[i]);
                    ordenado = true;
                    break;
                }
            }
            if(!ordenado) {
                    parOrd.add(array[i]);
                }
            }
        }
        
        return parOrd;
    }
    
    public static ArrayList<Integer> obteParellsOrdenatSenseRepeticions(int[] array){
        ArrayList<Integer> POSR = new ArrayList<>();
        boolean ordenado;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                ordenado = false;
                for( int j = 0; j < POSR.size(); j++){
                    if(array[i] < POSR.get(j)){
                        POSR.add(j, array[i]);
                        ordenado = true;
                        break;
                    }
                    if(POSR.get(j).equals(array[i])){
                        ordenado = true;
                        break;
                    }
                }
                if(!ordenado){
                    POSR.add(array[i]);
                }
            }
        }
        return POSR;
    }
    
    public static ArrayList<Integer> ObteRepetits(int[] array1, int[] array2) {
        ArrayList<Integer> repetidos = new ArrayList<>();
        
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    repetidos.add(array2[j]);
                }
            }
        }
        return repetidos;
    }
    
    public static ArrayList<Integer> obteDiferents(int[] array1, int[] array2) {
        ArrayList<Integer> diferentes = new ArrayList<>();
        boolean repetido;
        for(int i = 0; i < array1.length; i++){
            repetido = false;
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    repetido = true;
                    break;
                }
            }
            if(!repetido){
                diferentes.add(array1[i]);
            }
        }
        
        return diferentes;
    }
    
}

/**
  ArrayList<Integer> diferents = new ArrayList<>();        
        for(int  i = 0; i < array.length; i++){
            if(!diferents.contains(array[i])){
                diferents.add(array[i]);
            }
        }
        
        return diferents;
 */
