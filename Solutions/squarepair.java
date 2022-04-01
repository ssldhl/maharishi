public class squarepair {
    public static void main(String[] args) {
        System.out.println("Number of square-pairs in {9, 0, 2, -5, 7} is: " + f(new int[]{9, 0, 2, -5, 7}));
        System.out.println("Number of square-pairs in {9} is: " + f(new int[]{9}));
        System.out.println("Number of square-pairs in {9} is: " + f(new int[]{3, 0, 6, 10, 15, -17, 1, 9}));
    }

    public static int f(int[] a) {
        if(a.length < 2) return 0;
        int i, j, k = 0, count = 0, len = a.length;
        int[] pairs = new int[len * (len -1) / 2];

        for(i = 0; i < len; i++) {
            for(j = i + 1; j < len; j++) {
                if(a[i] > 0 && a[j] > 0) pairs[k++] = a[i] + a[j];
            }
        }

        for(i = 0; i < k; i++) {
            for(j = 2; ; j++) {
                if(pairs[i] == j* j) {System.out.println(pairs[i]);
                    ++count;
                    break;
                }
                if(pairs[i] < j * j) break;
            }
        }

        return count;
    }
}
