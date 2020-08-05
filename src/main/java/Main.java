
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
         
         
         
         for(int i=0; i<t.length; i++){
             System.out.print(" " +t[i]);
        }
    }
   

    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
   
     public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
     
    public static void sort(String[] array){
        Arrays.sort(array);
          
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);

    }
   
    

}
