public class countSquarePairs{
	public static void main(String[] args){
		int result = countSquarePairs(new int[]{11, 5, 4, 20});
		System.out.println(result);
		result = countSquarePairs(new int[]{9, 0, 2, -5, 7});
		System.out.println(result);
		result = countSquarePairs(new int[]{9});
		System.out.println(result);
	}

	static int countSquarePairs(int[] a){
		int countSquarePairs = 0;
		for(int targetIndex = 0; targetIndex < a.length; targetIndex++){
			for(int compareIndex = 0; compareIndex < a.length; compareIndex++){
				if(a[targetIndex] > 0 && a[compareIndex] > 0){
					if(a[targetIndex] < a[compareIndex]){
						if(isPerfectSquare(a[targetIndex] + a[compareIndex]) == 1){
							countSquarePairs ++;
						}
					}
				}
			}
		}
		return countSquarePairs;
	}

	static int isPerfectSquare(int element){
		int isPerfectSquare = 0;
		if(element >= 0){
			double sqrtResult = Math.sqrt(element);
			int base = (int) sqrtResult;
			if((sqrtResult - base) == 0){
				isPerfectSquare = 1;
			}else{
				isPerfectSquare = 0;
			}
		}
		return isPerfectSquare;
	}
}