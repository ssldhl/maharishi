public class closestfibo {
    public static void main(String[] args) {
        System.out.println(f(13));
        System.out.println(f(33));
        System.out.println(f(34));
    }

    static int f(int n) {
        int a = 1, sum, b;

        for(b = 1; ;) {
            sum = a + b;
            if(sum > n) break;
            a = b;
            b = sum;
        }

        return b;
    }
}
