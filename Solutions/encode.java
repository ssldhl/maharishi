import java.util.Arrays;

public class encode {
    public static void main(String[] args) {
        System.out.println("The array is: " + Arrays.toString(f(6936)));
    }

    static int[] f(int n) {
        int i, count = 0, temp = n;
        
        while(temp > 0) {
            for(i = 2; i <= temp; i++) {
                if(temp % i == 0) {
                    ++count;
                    break;
                }
            }
            temp /= i;
        }

        int[] ans = new int[count];
        count = 0;
        temp = n;

        while(temp > 0) {
            for(i = 2; i <= temp; i++) {
                if(temp % i == 0) {
                    ans[count++] = i;
                    break;
                }
            }
            temp /= i;
        }
        return ans;
    }
}
