public class samefactors {
    public static void main(String[] args) {
        System.out.println(f(-6, 21));
        System.out.println(f(6, 21));
        System.out.println(f(8, 12));
        System.out.println(f(23, 97));
        System.out.println(f(5, 7));
        System.out.println(f(8, 81));
    }

    static int f(int n1, int n2) {
        if(n1 < 0 || n2 < 0) return -1;
        int i, result, len, fact1 = 0, fact2 = 0;
        len = n1 > n2 ? n1 : n2;
        for(i = 1; i <= len ; i++) {
            if(n1 % i == 0 ) ++fact1;
            if(n2 % i == 0) ++fact2;
        }
        if(fact1 == fact2) result = 1;
        else result = 0;
        return result;
    }
}