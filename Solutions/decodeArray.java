public class decodeArray {
    public static void main(String[] args) {
        System.out.println("{0, -3, 0, -4, 0} is decoded to: " + f(new int[]{0, -3, 0, -4, 0}));
        System.out.println("{2, -3, -2, 6, 9, 18}  is decoded to: " + f(new int[]{2, -3, -2, 6, 9, 18} ));
        System.out.println("{1, 1} is decoded to: " + f(new int[]{1, 1}));
        System.out.println("{111, 115, 118, 127, 125}  is decoded to: " + f(new int[]{111, 115, 118, 127, 125} ));
        System.out.println("{-1, 5, 8, 17, 15} is decoded to: " + f(new int[]{-1, 5, 8, 17, 15}));
    }

    static int f(int[] a) {
        if(a.length < 2) return 0;

        int i, temp, sum = 0;

        for(i = 0; i < a.length - 1; i++) {
            temp = a[i] - a[i + 1];
            temp = temp < 1 ? temp * -1 : temp;
            sum = sum * 10 + temp;
        }
        sum = a[0] < 0 ? sum * -1 : sum;
        
        return sum;
    }
}
