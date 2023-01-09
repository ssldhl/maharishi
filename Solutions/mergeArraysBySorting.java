public class Main {
    public static void main(String args[]) {
      int [] y = {6,5,3} ;
      int [] x = {4,5,6};
      System.out.println(mergeArrays(x, y)); 
    }
    
    public static int []  mergeArrays(int [] array1, int [] array2){
        int[] array3 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        int [] newArray = new int [array3.length];
        int b =0 ;
        while ( array3.length > 0  && b < newArray.length) {
            int min = array3[0];
            for (int i=0; i < array3.length; i++) {
                if ( min > array3[i]) min = array3[i];
            }
            newArray[b] = min;
            array3 = removeMin(array3, min) ;
            b++;
            }
        for ( int i=0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        return newArray;
        
    }
    
    static int []  removeMin ( int [] array3, int min){
        int [] newArray = new int [array3.length - 1];
        int k = 0;
        for (int i = 0; i < array3.length; i++) { 
            if (array3[i] == min) {
                min = -1;
                continue;
                }
            newArray[k++] = array3[i];
        } 
        return newArray;
        
    }
 }
