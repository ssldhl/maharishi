public class primecount {
    public static void main(String[] args) {
        System.out.println("Prime numbers count between 10 & 30 is: " + f(10, 30));
        System.out.println("Prime numbers count between 11 & 29 is: " + f(11, 29));
        System.out.println("Prime numbers count between 20 & 22 is: " + f(20, 22));
        System.out.println("Prime numbers count between 1 & 1 is: " + f(1, 1));
        System.out.println("Prime numbers count between 5 & 5 is: " + f(5, 5));
        System.out.println("Prime numbers count between 6 & 2 is: " + f(6, 2));
        System.out.println("Prime numbers count between -10 & 6 is: " + f(-10, 6));
    }

    public static int f(int start, int end) {
        int count = 0, i, j, flag;
        if(start < 2) start = 2;
        
        for(i = start; i <= end; i++) {
            if(i == 2) {
                ++count;
                continue;
            }
            flag = 1;
            for(j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) ++count;
        }
        
        return count;
    }
}
