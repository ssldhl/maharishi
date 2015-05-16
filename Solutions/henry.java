public class henry{
	public static void main(String[] args){
		int result = henry(1, 3);
		System.out.println(result);
	}

	static int henry(int i, int j){
		int henry = 0;
		int max = Integer.MAX_VALUE;
		int perfectCount = 0;
		for(int number=1; number <= max; number++){
			int sum = 0;
			for(int divider = 1; divider < number; divider++){
				if(number % divider == 0){
					sum += divider;
				}
			}
			if(sum == number){
				perfectCount++;
				if(perfectCount == i){
					henry += sum;
				}else if(perfectCount == j){
					henry += sum;
					break;
				}
			}
		}
		return henry;
	}
}