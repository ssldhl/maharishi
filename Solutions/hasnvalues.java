public class hasnvalues {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 2, 1}, 2));
        System.out.println(f(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3} , 3));
        System.out.println(f(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 10));
        System.out.println(f(new int[]{1, 2, 2, 1}, 3));
        System.out.println(f(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3} , 2));
        System.out.println(f(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 20));
        // System.out.println(f(new int[]));
    }

    static int f(int[ ] a, int n) {
        int i, j, prev, result = 1, len = a.length, count = 1;
        int[] temp = a;

        for(i = 0; i < len; i++) {
            for(j = 0; j < len; j++) {
                if(temp[i] > temp[j]) {
                    prev = temp[i];
                    temp[i] = temp[j];
                    temp[j] = prev;
                }
            }
        }
        prev = temp[0];
        for(i = 1; i < len; i++) {
            if(prev != temp[i]) ++count;
            if(count > n) {
                result = 0;
                break;
            }
            prev = a[i];
        }
        if(count != n) result = 0;
        return result;
    }
}
