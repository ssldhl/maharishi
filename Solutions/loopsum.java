public class loopsum {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 3}, 2));
        System.out.println(f(new int[]{-1, 2, -1} , 7));
        System.out.println(f(new int[]{1, 4, 5, 6} , 4));
        System.out.println(f(new int[]{3}, 10));
    }

    static int f(int[] a, int n) {
        int i, j, sum = 0;
        for(i = 0, j = 0; i < n; i++) {
            if(j >= a.length) j = 0;
            sum += a[j++];
        }

        return sum;
    }
}
