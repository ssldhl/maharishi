public class zeroplentiful {
    public static void main(String[] args) {
        System.out.println(f(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0}));
        // System.out.println(f(new int[]));
    }

    static int f(int[] a) {
        if(a.length < 4) return 0;

        int i, zeroCount = 0, plentyCount = 0;

        for(i = 0; i < a.length; i++) {
            if(a[i] == 0) ++zeroCount;
            else{
                if(zeroCount > 0 && zeroCount < 4) return 0;
                else if(zeroCount >= 4) {
                    ++plentyCount;
                    zeroCount = 0;
                }
            }
        }
        if(zeroCount > 0 && zeroCount < 4) return 0;
        plentyCount += zeroCount / 4;

        return plentyCount;
    }
}
