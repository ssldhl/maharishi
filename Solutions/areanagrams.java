public class areanagrams {
    public static void main(String[] args) {
        System.out.println(f(new char[]{'p', 'o', 'l', 'l'}, new char[]{'l', 'o', 'p', '0'}));
        System.out.println(f(new char[]{'b', 'e', 'a', 'r'}, new char[]{'s', 't', 'a', 'r'}));
        System.out.println(f(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        // System.out.println(f(new char[]{}, new char[]{}));
        // System.out.println(f(new char[]{}, new char[]{}));
    }

    static int f(char[] a1, char[] a2) {
        if(a1.length != a2.length) return 0;
        int i, j;
        char temp;
        char[] copya1 = new char[a1.length], copya2 = new char[a1.length];
        copya1 = a1;
        copya2 = a2;

        for(i = 0; i < a1.length; i++){
            for(j = 0; j < a1.length; j++){
                if(copya1[i] < copya1[j]) {
                    temp = copya1[i];
                    copya1[i] = copya1[j];
                    copya1[j] = temp;
                }
                if(copya2[i] < a2[j]) {
                    temp = copya2[i];
                    copya2[i] = copya2[j];
                    copya2[j] = temp;
                }
            }
        }

        for(i = 0; i < a1.length; i++) {
            if(copya2[i] != copya1[i]) return 0;
        }

        return 1;
    }
}
