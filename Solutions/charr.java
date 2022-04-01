
class HelloWorld {
    public static void main(String[] args) {
        char arr[] = new char[]{'a', 'b', 'c'};
        char arr1[] = new char[]{};
        test(arr, 0, 4);
        test(arr, 0, 3);
        test(arr, 0, 2);
        test(arr, 0, 1);
        test(arr, 1, 3);
        test(arr, 1, 2);
        test(arr, 1, 1);
        test(arr, 2, 2);
        test(arr, 2, 1);
        test(arr, 3, 1);
        test(arr, 1, 0);
        test(arr, -1, 2);
        test(arr, -1, -2);
        test(arr1, 0, 1);
    }
    
    static void test(char a[], int start, int len) {
        
        if((start + len) > a.length || start < 0 || len < 0)  {
            System.out.print("--"+null);
            return null;
        }
        
        char ans[] = new char[len];
        int i, j;
        for(i = start, j = 0; i < len + start; i++) {
            ans[j] = a[i];
            System.out.print(a[i]);
        }
        
    }
}}