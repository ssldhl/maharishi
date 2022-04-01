class reverse {
    public static void main(String[] args) {
        System.out.println("The reverse for 1234 is: " +  f(1234));
        System.out.println("The reverse for 12005 is: " +  f(12005));
        System.out.println("The reverse for 1 is: " +  f(1));
        System.out.println("The reverse for 1000 is: " +  f(1000));
        System.out.println("The reverse for 0 is: " +  f(0));
        System.out.println("The reverse for -12345 is: " +  f(-12345));
    }

    public static int f(int n) {
        int num = n, res = 0, flag = 0;
        if(n < 0) {
            num = -1 * n;
            flag = 1;
        }
        while(num > 0) {
            res = res * 10 + num % 10;
            num = num / 10;
        }
        if (flag == 1) return -1 * res;
        return res;
    }
}