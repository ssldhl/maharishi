public class isInertial{
	public static void main(String[] args){
		int result = isInertial(new int[]{1});
		System.out.println(result);
		result = isInertial(new int[]{2});
		System.out.println(result);
		result = isInertial(new int[]{1, 2, 3, 4});
		System.out.println(result);
		result = isInertial(new int[]{1, 1, 1, 1, 1, 1, 2});
		System.out.println(result);
		result = isInertial(new int[]{2, 12, 4, 6, 8, 11});
		System.out.println(result);
		result = isInertial(new int[]{2, 12, 12, 4, 6, 8, 11});
		System.out.println(result);
		result = isInertial(new int[]{-2, -4, -6, -8, -11});
		System.out.println(result);
		result = isInertial(new int[]{2, 3, 5, 7});
		System.out.println(result);
		result = isInertial(new int[]{2, 4, 6, 8, 10});
		System.out.println(result);
	}

	static int isInertial(int[] a){
		int countOdd = 0;
		int max = Integer.MIN_VALUE;;
		for (int i = 0; i < a.length; i++) {
		    if (a[i] > max) {
			max = a[i];
		    }
		    if (a[i] % 2 != 0) {
			countOdd++;
		    }
		}
		if (countOdd == 0) {
		    return 0;
		}
		if (max % 2 != 0) {
		    return 0;
		}
		for (int i = 0; i < a.length; i++) {
		    for (int j = 0; j < a.length; j++) {
			if (a[i] % 2 != 0 && a[j] % 2 == 0 && a[j] != max && a[i] < a[j]) {
				return 0;
			}
		    }
		}
		return 1;
	}
}
