public class primeCount{
	public static void main(String[] args){
		int result = primeCount(10, 30);
		System.out.println(result);
		result = primeCount(11, 29);
		System.out.println(result);
		result = primeCount(20, 22);
		System.out.println(result);
		result = primeCount(1, 1);
		System.out.println(result);
		result = primeCount(5, 5);
		System.out.println(result);
		result = primeCount(6, 2);
		System.out.println(result);
		result = primeCount(-10, 6);
		System.out.println(result);
	}

	static int primeCount(int start, int end){
		int primeCount = 0;
		for(int number = start; number <= end; number++){
			if(number > 1){	
				boolean isPrime = true;
				for(int divider = 2; divider * 2 <= number; divider++){
					if(number % divider == 0){
						isPrime = false;
						break;
					}
				}
				if(isPrime){
					primeCount++;
				}
			}
		}
		return primeCount;
	}
}