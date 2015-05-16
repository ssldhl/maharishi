public class isNUnique{
	public static void main(String[] args){
		int result = isNUnique(new int[] {7, 3, 3, 2, 4}, 6);
		System.out.println(result);
		result = isNUnique(new int[] {7, 3, 3, 2, 4}, 10);
		System.out.println(result);
		result = isNUnique(new int[] {7, 3, 3, 2, 4}, 11);
		System.out.println(result);
		result = isNUnique(new int[] {7, 3, 3, 2, 4}, 8);
		System.out.println(result);
		result = isNUnique(new int[] {7, 3, 3, 2, 4}, 4);
		System.out.println(result);
		result = isNUnique(new int[] {1}, 6);
		System.out.println(result);
	}

	static int isNUnique(int[] a, int n){
		int isNUnique = 0;
		if(a.length > 2){
			for(int index = 0; index < a.length; index++){
				for(int innerIndex = index+1; innerIndex < a.length; innerIndex++){
						if(a[index]+a[innerIndex] == n){
							if(isNUnique == 0){
								isNUnique = 1;
							}else{
								isNUnique = 2;
								break;
							}
						}
				}
				if(isNUnique == 2){
					isNUnique = 0;
					break;
				}
			}
		}
		return isNUnique;
	}
}