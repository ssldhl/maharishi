import java.util.Arrays;

public class computedepth {
    public static void main(String[] args) {
        System.out.println("The depth for 42 is: " + f(42));
        System.out.println("The depth for 8 is: " + f(8));
        System.out.println("The depth for 7 is: " + f(7));
        System.out.println("The depth for 13 is: " + f(13));
        System.out.println("The depth for 29 is: " + f(29));
    }

    public static int f(int n) {
        int i, j, temp, flag, current, depth = 0, pos = 0;
        int[] nums = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        // Arrays.fill(nums, -1);

        // for(i = 1; i < 50; i++) {
        //     temp = n * i;
        //     while(temp > 0) {
        //         flag = 1;
        //         current = temp % 10;
        //         for(j = 0; j < pos; j++) {
        //             if(current == nums[j]) {
        //                 flag = 0;
        //                 break;
        //             }
        //         }
        //         if(flag == 1) nums[pos++] = current;
        //         temp /= 10;
        //     }
        //     ++depth;
        //     if(pos >= 10) break;
        // }

        for(i = 1; ; i++) {
            temp = n * i;
            while(temp > 0) {
                current = temp % 10;
                nums[current] = current;
                temp /= 10;
            }
            flag = 1;
            for(j = 0; j < 10; j++) {
                if(j != nums[j]) {
                    flag = 0;
                    break;
                }
            }
            ++depth;
            if(flag == 1) break;
        }

        return depth;
    }
}
