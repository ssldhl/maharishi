public class perfectnumber {
    public static void main(String[] args) {
        System.out.println("sum of perfect number (2, 3) " + f(2, 4));
    }

    public static int f(int start, int end) {
        if(end <= start) return 0;
        int i, j, temp = 0, ind = 0, sum = 0;

        for(i = 4; ; i++) {
            temp = 0;
            for(j = 1; j < i; j++) {
                if(i % j == 0) temp += j;
            }
            if(temp == i) { System.out.println("sum of perfect number " + i);
                ++ind;
                if(ind == start) sum += i;
                else if(ind == end) {
                    sum += i;
                    break;
                }
            }
        }

        return sum;
        // return 1;
    }
}
