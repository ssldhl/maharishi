public class upcount {
    public static void main(String[] args) {
        System.out.println("The upcount is "+ f(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 8, 5));
        System.out.println("The upcount is "+ f(new int[]{6, 3, 1}, 3, 6));
    }
    
    public static int f(int[] a, int len, int n) {
        int i, sum = 0, count = 0, flag = 0;
        for(i = 0; i < len; i++) {
            sum += a[i];
            if(sum > n && flag == 0) {
                ++count;
                flag = 1;
            }
            if(sum <= n) flag = 0;
        }
        return count;
    }
}
