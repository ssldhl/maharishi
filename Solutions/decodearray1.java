public class decodearray1 {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1}));
        System.out.println(f(new int[]{0, 1, 1, 1, 1, 1, 0, 1} ));
        System.out.println(f(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1} ));
        System.out.println(f(new int[]{-1, 0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1} ));
        System.out.println(f(new int[]{-1, 0, 1} ));
        // System.out.println(f(new int[]));{-1, 0, 1} 
    }

    static int f(int[] a) {
        int start = 0, i, count = 0, ans = 0;
        if(a[0] == -1) start = 1;

        for(i = start; i < a.length; i++) {
            if(a[i] == 0) ++count;
            else{
                ans = ans * 10 + count;
                count = 0;
            }
        }

        return start == 0 ? ans : -1 * ans;
    }
}
