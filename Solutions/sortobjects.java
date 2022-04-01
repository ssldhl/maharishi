public class sortobjects {
    public static void main (String[] args) {
        Test[] test = new Test[3];
        test[0] = new Test(3, "Bikram");
        test[1] = new Test(1, "Bikash");
        test[2] = new Test(2, "Bishal");
        f(test, new int[]{1, 2, 3});
    }

    public static void f(Test[] arr, int[] pos) {
        int i, j;
        Test[] test = new Test[3];
        for(i = 0; i < arr.length; i++) {
            for(j = 0; j < pos.length; j++) {
                if(arr[j].id == pos[i]) {
                    test[i] = arr[j];
                    break;
                }
            }    
        }
        System.out.println(test[0].id + " -- " +test[0].name);
        System.out.println(test[1].id + " -- " +test[1].name);
        System.out.println(test[2].id + " -- " +test[2].name);
    }
}

class Test {
    int id;
    String name;
    
    Test(int id, String name) {
        this.id = id;
        this.name = name;
    }
}