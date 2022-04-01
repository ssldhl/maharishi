public class gauthriecount {
    public static void main(String[] args) {
        System.out.println("Gauthrie count for 7 is: " + f(7));
        System.out.println("Gauthrie count for 1 is: " + f(1));
        System.out.println("Gauthrie count for 2 is: " + f(2));
        System.out.println("Gauthrie count for 3 is: " + f(3));
        System.out.println("Gauthrie count for 4 is: " + f(4));
        System.out.println("Gauthrie count for 42 is: " + f(42));
    }

    public static int f(int n) {
        if(n == 1) return 0;
        
        int count = 0;

        for( ; ; ) {
            if(n % 2 == 1) n = n * 3 + 1;
            else if(n / 2 == 1) {
                ++count;
                break;
            }
            else n = n / 2;
            ++count;
        }

        return count;
    }
}
