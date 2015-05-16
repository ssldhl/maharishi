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
		int isInertial = 0;
		boolean containsOddValue = false;
		int maxValue = Integer.MIN_VALUE;
		int[] oddValues = new int[a.length];
		int[] evenValues = new int[a.length];
		int oddValuesIndex = 0;
		int evenValuesIndex = 0;
		for(int index = 0; index < a.length; index++){
			if((a[index] % 2) != 0){
				containsOddValue = true;
				oddValues[oddValuesIndex] = a[index];
				oddValuesIndex++;
			}else{
				evenValues[evenValuesIndex] = a[index];
				evenValuesIndex++;
			}
			if(a[index] > maxValue){
				maxValue = a[index];
			}
		}
		if(containsOddValue){
			if(maxValue % 2 == 0){
				for(int oddIndex = 0; oddIndex < oddValuesIndex; oddIndex++){
					for(int evenIndex = 0; evenIndex < evenValuesIndex; evenIndex++){
						if(evenValues[evenIndex] != maxValue){
							if(oddValues[oddIndex] > evenValues[evenIndex]){
								isInertial = 1;
							}else{
								isInertial = 0;
								break;
							}
						}else{
							isInertial = 1;
						}
					}
					if(isInertial == 0){
						break;
					}
				}
			}
		}
		return isInertial;
	}
}