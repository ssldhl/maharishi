public class digitincreasing {
    public static void main(String[] args) {
        System.out.println(f(36));
        System.out.println(f(984));
        System.out.println(f(12));
        System.out.println(f(100));
        System.out.println(f(7404));
    }

    static int f(int n) {
        int sum, pow, i, j;
        
        for(i = 1; i <= 9; i++) {
            sum = 0;
            pow = 1;
            for( ; ; ) {
                sum += i * pow;
                pow = pow * 10 + 1;
                if(sum == n) return 1;
                else if(sum > n) break;
            }
        }

        return 0;
    }
}
