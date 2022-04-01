public class railroad {
    public static void main(String[] args) {
        System.out.println("Railroad status of {1, 2, 0, 3, -18, 0, 2, 2} is: " + f(new int[]{1, 2, 0, 3, -18, 0, 2, 2}));
        System.out.println("Railroad status of {1, 2} is: " + f(new int[]{1, 2}));
        System.out.println("Railroad status of {1, 2, 0, 1, 2, 0, 1, 2}  is: " + f(new int[]{1, 2, 0, 1, 2, 0, 1, 2} ));
        System.out.println("Railroad status of {3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3} is: " + f(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
        System.out.println("Railroad status of {0, 0, 0, 0}  is: " + f(new int[]{0, 0, 0, 0} ));
        System.out.println("Railroad status of {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}  is: " + f(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ));
        System.out.println("Railroad status of {1, 3, 0, 3, 5, 0}  is: " + f(new int[]{1, 3, 0, 3, 5, 0} ));
    }

    static int f(int[] a) {
        if(a[0] == 0 || a[a.length - 1] == 0) return 0;
        int i;
        for(i = 0; i < a.length; i++) {
            if(i == 0) {
                if(a[i + 1] == 0) return 0;
            } else if(i == a.length - 1) {
                if(a[i - 1] == 0) return 0;
            } else {
                if(a[i] == 0 && (a[i + 1] == 0 || a[i - 1] == 0)) return 0;
                if(a[i] != 0 && (a[i + 1] != 0 && a[i - 1] != 0)) return 0;
            }
        }
        return 1;
    }
}
