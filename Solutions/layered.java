public class layered {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 1, 2, 2, 2, 3, 3} ));
        System.out.println(f(new int[]{3, 3, 3, 3, 3, 3, 3} ));
        System.out.println(f(new int[]{1, 2, 2, 2, 3, 3}));
        System.out.println(f(new int[]{2, 2, 2, 3, 3, 1, 1}));
        System.out.println(f(new int[]{2}));
        System.out.println(f(new int[]{} ));
        System.out.println(f(new int[]{1, 1, 2, 2} ));
    }

    static int f(int[] a) {
        if(a.length < 2) return 0;
        int i, result = 1, len = a.length, prev = a[0], count = 1;
        for(i = 1; i < len; i++) {
            if(a[i] == prev) ++count;
            else {
                if(a[i] < prev || count < 2) {
                    result = 0;
                    break;
                } else {
                    count = 1;
                    prev = a[i];
                }
            }
        }
        return result;
    }
}
