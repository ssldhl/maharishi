public class checksub {
    public static void main(String[] args) {
        System.out.println(f("bikramismyname", "ismy"));
    }

    public static int f(String str, String sub) {
        if(str.length() < sub.length() || str.length() == 0 || sub.length() == 0) return 0;
        int len1 = str.length(), len2 = sub.length(), i, j, flag = 0;
        for(i = 0; i < len1 - len2; i++) {
            flag = 1;
            for(j = 0; j < len2; j++) {
                if(str.charAt(i + j) != sub.charAt(j)) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) break;
        }
        return flag;
    }
}
