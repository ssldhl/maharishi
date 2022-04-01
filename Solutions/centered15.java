public class centered15 {
    public static void main(String[] args) {
        System.out.println("{3, 2, 10, 4, 1, 6, 9} centered15 status: " + f(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println("{2, 10, 4, 1, 6, 9} centered15 status: " + f(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println("{3, 2, 10, 4, 1, 6}  centered15 status: " + f(new int[]{3, 2, 10, 4, 1, 6} ));
        System.out.println("{1,1,8, 3, 1, 1} centered15 status: " + f(new int[]{1,1,8, 3, 1, 1}));
        System.out.println("{9, 15, 6}  centered15 status: " + f(new int[]{9, 15, 6} ));
        System.out.println("{1, 1, 2, 2, 1, 1}  centered15 status: " + f(new int[]{1, 1, 2, 2, 1, 1} ));
        System.out.println("{1, 1, 15, -1,-1}  centered15 status: " + f(new int[]{1, 1, 15, -1,-1} ));
        System.out.println("{1, 1, 14, 1, 1,-1}  centered15 status: " + f(new int[]{1, 1, 14, 1, 1,-1} ));
    }

    public static int f(int[] a) {
        if(a.length < 3) return 0;
        int i, j, sum, center, left = 1;

        // for(i = 1; i < a.length - 1; i++, left++) {
        //     center = 0;
        //     sum = 0;
        //     for(j = i; j < a.length -1; j++) {
        //         sum += a[j];
        //         ++center;
        //         if(sum == 15 && left == (a.length - left - center)) return 1;
        //         else if(sum > 15) break;
        //     }
        // }

        for(i = 1; i < a.length - 1; i++, left++) {
            sum = 0;
            for(j = i; j < a.length -i; j++) {
                sum += a[j];
                if(sum > 15) break;
            }
            // System.out.println(left);
            if(sum == 15 ) return 1;
        }

        return 0;
    }
}
