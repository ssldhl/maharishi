public class porcupine {
    public static void main(String[] args) {
        System.out.println("The porcupine number for 419 is: " + f(709));
    }

    public static int f(int n) {
        int i, flag, porcupine = 0;
        
        if(n % 2 == 0) n += 1;
        else n += 2;

        for( ; ;n += 2 ) {
            flag = 1;
            for(i = 3; i < n; i += 2) {
                if(n % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1 && porcupine % 10 == 9 && n % 10 == 9) break;
            else if(flag == 1) porcupine = n;
        }
        return porcupine;
    }
}
