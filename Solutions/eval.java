public class eval {
    public static void main(String[] args) {
        System.out.println(f(1.0, new int[]{0, 1, 2, 3, 4}));
        System.out.println(f(3.0, new int[]{3, 2, 1} ));
        System.out.println(f(2.0, new int[]{3, -2, -1}));
        System.out.println(f(-3.0, new int[]{3, 2, 1} ));
        System.out.println(f(2.0, new int[]{3, 2} ));
        System.out.println(f(2.0, new int[]{4, 0, 9}));
        System.out.println(f(2.0, new int[]{10}));
        System.out.println(f(10.0, new int[]{0, 1}));
    }

    static double f(double x, int[] a) {
        int i, j, pow;
        double sum = 0;

        for(i = 0; i < a.length; i++) {
            pow = 1;
            for(j = 0; j < i; j++) {
                pow *= x;
            }
            sum += pow * a[i];
        }

        return sum;
    }
}
