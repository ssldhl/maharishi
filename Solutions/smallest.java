public class smallest {
    public static void main(String[] args) {
        System.out.println("The smallest number for 1 is: " + f(7));
    }

    static int f(int n) {
        int i, j, temp, flag = 0;

        for(i = 1; ; i++) {
            for(j = 1; j <= n; j++) {
                flag = 0;
                temp = i * j;
                while(temp > 0) {
                    if(temp % 10 == 2) {
                        flag = 1;
                        break;
                    }
                    temp /= 10;
                }
                if(flag == 0) break;
            }
            if(flag == 1) break;
        }

        return i;
    }
}
