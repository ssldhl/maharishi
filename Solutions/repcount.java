public class repcount {
    public static void main(String[] args) {
        System.out.println("The rep count for 10 is: " + f(10));
    }

    public static int f(int n) {
        int r20, num20, r10, num10, r5, num5, r2, num2, r1, num1, total, count = 0;
        
        for(r20 = 0; r20 <= n; r20++){
            num20 = r20 * 20;
            if(num20 > n) break;
            for(r10 = 0; r10 <= n; r10++){
                num10 = r10 * 10;
                if(num10 > n) break;
                for(r5 = 0; r5 <= n; r5++){
                    num5 = r5 * 5;
                    if(num5 > n) break;
                    for(r2 = 0; r2 <= n; r2++){
                        num2 = r2 * 2;
                        if(num2 > n) break;
                        for(r1 = 0; r1 <= n; r1++){
                            num1 = r1 * 1;
                            total = num20 + num10 + num5 + num2 + num1;
                            if(total == n) {
                                ++count;
                                break;
                            } else if(total > n) break;
                        }
                    }
                }
            }
        }

        return count;
    }
}
