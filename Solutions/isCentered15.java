public class isCentered15{
	public static void main(String[] args){
		int result = isCentered15(new int[] {3, 2, 10, 4, 1, 6, 9});
		System.out.println(result);
		result = isCentered15(new int[] {2, 10, 4, 1, 6, 9});
		System.out.println(result);
		result = isCentered15(new int[] {3, 2, 10, 4, 1, 6});
		System.out.println(result);
		result = isCentered15(new int[] {1, 1, 8, 3, 1, 1});
		System.out.println(result);
		result = isCentered15(new int[] {9, 15, 6});
		System.out.println(result);
		result = isCentered15(new int[] {1, 1, 2, 2, 1, 1});
		System.out.println(result);
		result = isCentered15(new int[] {1, 1, 15, -1, -1});
		System.out.println(result);
	}

	static int isCentered15(int[] a){
		int isCentered15 = 0;
		int lowerIndex = 0;
		int upperIndex = 0;
		int sum = 0;
		if(a.length % 2 == 0){
			lowerIndex = (a.length / 2) - 1;
			upperIndex = a.length / 2 ;
		}else{
			lowerIndex = (a.length - 1) / 2;
			upperIndex = lowerIndex; 
		}
		while(lowerIndex >= 0 && upperIndex < a.length){
			sum = 0;
			for(int index = lowerIndex; index <= upperIndex; index++){
				sum += a[index];
			}
			if(sum == 15){
				isCentered15 = 1;
				break;
			}
			lowerIndex--;
			upperIndex++;
		}
		return isCentered15;
	}
}