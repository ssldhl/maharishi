public class isMadhavArray{
	public static void main(String[] args){
		int result = isMadhavArray(new int[]{2, 1, 1});
		System.out.println(result);
		result = isMadhavArray(new int[]{2, 1, 1, 4, -1, -1});
		System.out.println(result);
		result = isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0});
		System.out.println(result);
		result = isMadhavArray(new int[]{18, 9, 10, 6, 6, 6});
		System.out.println(result);
		result = isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4});
		System.out.println(result);
		result = isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1});
		System.out.println(result);
		result = isMadhavArray(new int[]{3, 1, 2, 3, 0});
		System.out.println(result);
	}

	static int isMadhavArray(int[] a){
		boolean flag = false;
        	for (int i = 1; i <= a.length; i++) {
            		if (a.length == i * (i + 1) / 2) 
				flag = true;
        	}
		
        	if (!flag) 
			return 0;
		
        	for (int i = 1; i < a.length; i++) {
		    int sum = 0;
		    int x = i * (i + 1) / 2;
			
		    if (x >= a.length) {
			break;
		    }
			
		    for (int j = x; j <= (x + i); j++) {
			sum += a[j];
		    }
			
		    if (a[0] != sum) 
			    return 0;
        	}
        	return 1;
	}
}
