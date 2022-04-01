import java.util.Arrays;

public class hms {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(3735)));
        System.out.println(Arrays.toString(f(380)));
    }

    static int[] f(int seconds) {
        int[] time = new int[3];
        int pow = 3600, pos = 0;

        while(seconds > 0) {
            time[pos++] = seconds / pow;
            seconds %= pow;
            pow /= 60;
        }

        return time;
    }
}
