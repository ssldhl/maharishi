import java.util.Arrays;

class common {
    public static void main(String[] args) {
        System.out.println("The common array is: "+ Arrays.toString(f(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1})));
        System.out.println("The common array is: "+ Arrays.toString(f(new int[]{1, 8, 3, 2, 6}, new int[]{2, 6, 1})));
        System.out.println("The common array is: "+ Arrays.toString(f(new int[]{1, 3, 7, 9}, new int[]{7, 1, 9, 3})));
        System.out.println("The common array is: "+ Arrays.toString(f(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println("The common array is: "+ Arrays.toString(f(new int[]{}, new int[]{1, 2, 3})));
        System.out.println("The common array is: "+ Arrays.toString(f(new int[]{1, 2}, new int[]{})));
        System.out.println("The common array is: "+ Arrays.toString(f(new int[]{1, 2}, null)));
        System.out.println("The common array is: "+ Arrays.toString(f(null, new int[]{})));
        System.out.println("The common array is: "+ Arrays.toString(f(null, null)));
    }

    public static int[] f(int[] first, int[] second) {
        if(first == null || second == null) return null;
        if(first.length == 0 || second.length == 0) return new int[]{};
        
        int i, j, k = 0, len = first.length < second.length ? first.length : second.length;
        int[] a, b, temp = new int[len];

        if(first.length <= second.length) {
            a = first;
            b = second;
        } else {
            a = second;
            b = first;
        }

        for(i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j ++) {
                if(a[i] == b[j]) temp[k++] = a[i];
            }
        }
        int[] common = new int[k];
        for(i = 0; i < k; i++) common[i] = temp[i];
        return common;
    }
}