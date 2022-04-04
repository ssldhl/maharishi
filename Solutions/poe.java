class test {
    public static void main(String[] args) {
        System.out.println("POE for {1, 8, 3, 7, 10, 2} is: "+ f(new int[]{1, 8, 3, 7, 10, 2}));
        System.out.println("POE for {1, 5, 3, 1, 1, 1, 1, 1, 1} is: "+ f(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}));
        System.out.println("POE for {2, 1, 1, 1, 2, 1, 7} is: "+ f(new int[]{2, 1, 1, 1, 2, 1, 7}));
        System.out.println("POE for {1, 2, 3} is: "+ f(new int[]{1, 2, 3}));
        System.out.println("POE for {3, 4, 5, 10} is: "+ f(new int[]{3, 4, 5, 10}));
        System.out.println("POE for {1, 2, 10, 3, 4} is: "+ f(new int[]{1, 2, 10, 3, 4}));
    }

    public static int f(int[] a) {
        int left = 0, right, i, j, pos = -1;
        for(i = 1; i < a.length - 1; i++) {
            left = left + a[i - 1];
            right = 0;
            for(j = i + 1; j < a.length; j++) {
                right += a[j];
            }
            if(left == right) pos = i;
        }
        return pos;
    }
}