public class madhav {
    public static void main(String[] args) {
        System.out.println("{2, 1, 1} is a madhav array: "+ f(new int[]{2, 1, 1}));
        System.out.println("{2, 1, 1, 4, -1, -1} is a madhav array: "+ f(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println("{6, 2, 4, 2, 2, 2, 1, 5, 0, 0} is a madhav array: "+ f(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println("{18, 9, 10, 6, 6, 6} is a madhav array: "+ f(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println("{-6, -3, -3, 8, -5, -4} is a madhav array: "+ f(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println("{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1} is a madhav array: "+ f(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println("{3, 1, 2, 3, 0} is a madhav array: "+ f(new int[]{3, 1, 2, 3, 0}));
    }   
    
    public static int f(int [] a) {
        int len = a.length;
        if(len < 3) return 0;
        
        int i, j, k, sum = 0, pos, init = a[0];
        for(i = 2; ; i++) {
            sum = i * (i + 1) / 2;
            if(sum == len) break;
            if(sum > len) return 0;
        }
        pos = i;

        for(i = 1, k = 1; i < pos; i++) {
            sum = 0;
            for(j = 0; j < i+1; j++) {
                sum += a[k++];
            }
            if(sum != init) return 0;
        }

        return 1;
    }
}
