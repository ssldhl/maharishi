import java.util.Arrays;

public class allpossibilities {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 0, 3}));
        System.out.println(f(new int[]{3, 2, 1, 0} ));
        System.out.println(f(new int[]{1, 2, 4, 3} ));
        System.out.println(f(new int[]{0, 2, 3} ));
        System.out.println(f(new int[]{0} ));
        System.out.println(f(new int[]{} ));
    }

    static int f(int[] a) {
        if(a.length == 0) return 0;

        int i, j, temp, result = 1;
        int[] temparray = a;

        for(i = 0; i < temparray.length; i++) {
            for(j = 0; j < temparray.length; j++) {
                if(temparray[i] < temparray[j]) {
                    temp = temparray[i];
                    temparray[i] = temparray[j];
                    temparray[j] = temp;
                }
            }
        }
        for(i = 0; i < temparray.length; i++) {
            if(temparray[i] != i) {
                result = 0;
                break;
            }
        }
        return result;
    }
}
