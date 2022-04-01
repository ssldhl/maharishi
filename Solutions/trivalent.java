public class trivalent {
    public static void main(String[] args) {
        System.out.println("{22, 19, 10, 10, 19, 22, 22, 10}  trivalent status is: " + f(new int[]{22, 19, 10, 10, 19, 22, 22, 10} ));
        System.out.println("{1, 2, 2, 2, 2, 2, 2} trivalent status is: " + f(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println("{-1, 0, 1, 0, 0, 0} trivalent status is: " + f(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println("{2147483647, -1, -1, -2147483648} trivalent status is: " + f(new int[]{2147483647, -1, -1, -2147483648}));
        System.out.println("{} trivalent status is: " + f(new int[]{}));
        System.out.println("{2, 2, 3, 3, 3, 3, 2, 41, 65} trivalent status is: " + f(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
        // System.out.println(" trivalent status is: " + f(new int[]));
    }

    public static int f(int[] a) {
        if(a.length < 3) return 0;
        int i, j, pos = 0, zero = 0, flag;
        int[] nums = new int[3];

        for(i = 0; i < a.length; i++) {
            flag = 1;
            for(j = 0; j < 3; j++) {
                if(a[i] == nums[j] && a[i] != 0) flag = 0;
            }
            if(a[i] == 0 && zero == 0) {
                nums[pos++] = a[i];
                zero = 1;
            } else if(a[i] != 0 && flag == 1) {
                if(pos < 3) nums[pos++] = a[i];
                else if(pos == 3) return 0;
            }
        }
        if(pos < 3) return 0;
        return 1;
    }
}
