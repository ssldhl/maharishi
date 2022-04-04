public class allvaluessame {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 1, 1, 1}));
        System.out.println(f(new int[]{83, 83, 83}));
        System.out.println(f(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        System.out.println(f(new int[]{1, -2343456, 1, -2343456} ));
        System.out.println(f(new int[]{0, 0, 0, 0, -1} ));
        System.out.println(f(new int[]{432123456} ));
        System.out.println(f(new int[]{-432123456} ));
        System.out.println(f(new int[]{}));
    }

    static int f(int[ ] a) {
        if(a.length == 0) return 0;
        int i, digit = a[0], result = 1;
        for(i = 1; i < a.length; i++) {
            if(a[i] != digit) {
                result = 0;
                break;
            }
        }
        return result;
    }
}
