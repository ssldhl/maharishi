public class isStacked {
    public static void main(String[] args){
        int result = isStacked(10);
        System.out.println(result);
        result = isStacked(8);
        System.out.println(result);
        result = isStacked(21);
        System.out.println(result);
    }

    static int isStacked(int n){
        int number_sum = 0;
        int isStacked = 0;
        for (int i = 0; i <= n; i++){
            number_sum += i;
            if (number_sum == n){
                isStacked = 1;
                break;
            }
        }
        return isStacked;
    }
}
