public class repsequal {
    public static void main(String[] args) {
        System.out.println(f(new int[]{3, 2, 0, 5, 3}, 32053));
        System.out.println(f(new int[]{3, 2, 0, 5}, 32053));
        System.out.println(f(new int[]{3, 2, 0, 5, 3, 4}, 32053));
        System.out.println(f(new int[]{2, 3, 0, 5, 3}, 32053));
        System.out.println(f(new int[]{9, 3, 1, 1, 2}, 32053));
        System.out.println(f(new int[]{0, 3, 2, 0, 5, 3}, 32053));
        System.out.println(f(new int[]{1, 2, 3, 4, 5}, 12345));
        System.out.println(f(new int[]{1, 2}, 12));
        System.out.println(f(new int[]{0, 0, 0, 9, 0, 8, 7, 6, 5, 4, 3}, 90876543));
    }

    public static int f(int[] a, int n) {
        int i, j, sum = 0;
        
        for(i = a.length - 1, j = 0; i >= 0; i--) {
            sum += Math.pow(10, j++) * a[i];
        }
        if(n != sum) return 0;
        return 1;
    }
}
