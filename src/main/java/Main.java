
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
         String[] t = {"x", "a", "b", "d"};
         for(int i=0; i<t.length; i++){
             System.out.print(" " +t[i]);
        }
         sort(array);
         for(int i=0; i<array.length; i++){
             System.out.print(" " +array[i]);
        }
         System.out.println("");
         sortStringArray(t);
         
         
         for(int i=0; i<t.length; i++){
             System.out.print(" " +t[i]);
        }
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int index=startIndex;
        int aux=array[index];
        for(int i=startIndex; i<array.length; i++){
            
            if( aux>array[i]){
                aux=array[i];
                index=i;
            }
        }

        return index;
    }
    
    public static void swap(int array[], int index1, int index2){
        int auxiliar = array[index1];
        array[index1]=array[index2];
        array[index2]=auxiliar;
    }
    public static void sort(int[] array){
        int i=0;
        while (i<array.length-1){
            int auxIndex=indexOfSmallestFrom(array,i);
            swap(array,i,auxIndex);
            i++;
        }
    }
    
   
     public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
     
    

    
    public static void sortStringArray(String[] array){
        Arrays.sort(array);
          
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);

    }
   
    

}
