public class sumFactor{
	public static void main(String[] args){
		int result = sumFactor(new int[] {3, 0, 2, -5, 0});
		System.out.println(result);
		result = sumFactor(new int[] {9, -3, -3, -1, -1});
		System.out.println(result);
		result = sumFactor(new int[] {1});
		System.out.println(result);
		result = sumFactor(new int[] {0, 0, 0});
		System.out.println(result);
	}

	static int sumFactor(int[] a){
		int sumFactor = 0;
		int sum = 0;
		for(int index = 0; index < a.length; index++){
			sum += a[index];
		}
		for(int index = 0; index < a.length; index++){
			if(a[index] == sum){
				sumFactor++;
			}
		}
		return sumFactor;
	}
}