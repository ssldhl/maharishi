public class sumfactor {
    public static void main(String[] args) {
        System.out.println("Sum factor for {1, -1, 1, -1, 1, -1, 1}  is: " + f(new int[]{1, -1, 1, -1, 1, -1, 1} ));
        System.out.println("Sum factor for {1, 2, 3, 4}  is: " + f(new int[]{1, 2, 3, 4} ));
        System.out.println("Sum factor for {3, 0, 2, -5, 0} is: " + f(new int[]{3, 0, 2, -5, 0}));
        System.out.println("Sum factor for {9, -3, -3, -1, -1} is: " + f(new int[]{9, -3, -3, -1, -1}));
        System.out.println("Sum factor for {1} is: " + f(new int[]{1}));
        System.out.println("Sum factor for {0, 0, 0} is: " + f(new int[]{0, 0, 0}));
    }

    public static int f(int[] a) {
        if(a.length == 0) return 0;
        int i, sum = 0, count = 0;
        
        for(i = 0; i < a.length; i++) sum += a[i];

        for(i = 0; i < a.length; i++) if(a[i] == sum) ++count;

        return count;
    }
}
