public class cubePowerful {
    public static void main(String[] args) {
        System.out.println("153 cubePowerful status: " + f(153));
        System.out.println("12 cubePowerful status: " + f(12));
        System.out.println("370 cubePowerful status: " + f(370));
        // System.out.println(" cubePowerful status: " + f());
    }

    static int f(int n) {
        if(n <= 0) return 0;

        int digit, sum = 0, temp = n;

        while(temp > 0) {
            digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == n ? 1 : 0;
    }

}
