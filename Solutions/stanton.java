public class stanton {
    public static void main(String[] args) {
        System.out.println("stanton measure for {1, 4, 3, 2, 1, 2, 3, 2} is: " + f(new int[]{1, 4, 3, 2, 1, 2, 3, 2}));
        System.out.println("stanton measure for {1} is: " + f(new int[]{1}));
        System.out.println("stanton measure for {0} is: " + f(new int[]{0}));
        System.out.println("stanton measure for {3, 1, 1, 4} is: " + f(new int[]{3, 1, 1, 4}));
        System.out.println("stanton measure for {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4} is: " + f(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
        System.out.println("stanton measure for {} is: " + f(new int[]{}));
    }

    public static int f(int[] a) {
        if(a.length == 0) return 0;
        int i, count = 0, n = 0;

        for(i = 0; i < a.length; i++) {
            if(a[i] == 1) ++n;
        }
        for(i = 0; i < a.length; i++) {
            if(a[i] == n) ++count;
        }

        return count;
    }
}
