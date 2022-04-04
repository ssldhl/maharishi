import java.util.Arrays;

class sub {
    public static void main(String[] args) {
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, 0, 4)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, 0, 3)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, 0, 2)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, 0, 1)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, 1, 3)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, 1, 2)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, 1, 1)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, 2, 2)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, 2, 1)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, 3, 1)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, 1, 0)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, -1, 2)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{'a', 'b', 'c'}, -1, -2)));
        System.out.println("The array is: " + Arrays.toString(f(new char[]{}, 0, 1)));
    }

    public static char[] f(char[] a, int start, int len) {
        if(a.length < (start + len) || start < 0 || len < 0) return null;
        char[] res = new char[len];
        int i, j;
        for(i = start, j=0; j < len; i++, j++) {
            res[j] = a[i];
        }
        return res;
    }
}