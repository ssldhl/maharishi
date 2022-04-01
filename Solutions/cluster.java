import java.util.Arrays;

public class cluster {
    public static void main(String[] args) {
        System.out.println("{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4} after cluster compression becomes: " + Arrays.toString(f(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4})));
        System.out.println("{0, 0, 0, 2, 0, 2, 0, 2, 0, 0} after cluster compression becomes: " + Arrays.toString(f(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
        System.out.println("{18} after cluster compression becomes: " + Arrays.toString(f(new int[]{18})));
        System.out.println("{} after cluster compression becomes: " + Arrays.toString(f(new int[]{})));
        System.out.println("{-5, -5, -5, -5, -5} after cluster compression becomes: " + Arrays.toString(f(new int[]{-5, -5, -5, -5, -5})));
        System.out.println("{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1} after cluster compression becomes: " + Arrays.toString(f(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println("{8, 8, 6, 6, -2, -2, -2}  after cluster compression becomes: " + Arrays.toString(f(new int[]{8, 8, 6, 6, -2, -2, -2} )));
    }

    static int[] f(int[] a) {
        if(a.length <= 1) return a;
        int i, current = a[0], count = 1;

        for(i = 1; i < a.length; i++) {
            if(a[i] != current) {
                current = a[i];
                ++count;
            }
        }

        int[] ans = new int[count];
        count = 1;
        current = a[0];
        ans[0] = current;

        for(i = 1; i < a.length; i++) {
            if(a[i] != current) {
                current = a[i];
                ans[count++] = a[i];
            }
        }

        return ans;
    }
}
