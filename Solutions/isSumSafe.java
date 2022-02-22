public class isSumSafe {
    public static void main(String[] args){
        int result = isSumSafe(new int[]{5, -5, 0});
        System.out.println(result);
        result = isSumSafe(new int[]{2, -5, 0});
        System.out.println(result);
        result = isSumSafe(new int[]{1, -5, 0});
        System.out.println(result);
    }

    static int isSumSafe(int[] numbers){
        int array_sum = 0;
        int is_safe = 1;
        for (int num: numbers
        ) {
            array_sum += num;
        }

        for (int num: numbers
        ) {
            if (num == array_sum){
                is_safe = 0;
                break;
            }
        }

        return is_safe;
    }
}
