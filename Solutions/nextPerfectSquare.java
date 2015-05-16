public class nextPerfectSquare{
	public static void main(String[] args){
		int result = nextPerfectSquare(6);
		System.out.println(result);
		result = nextPerfectSquare(36);
		System.out.println(result);
		result = nextPerfectSquare(0);
		System.out.println(result);
		result = nextPerfectSquare(-5);
		System.out.println(result);
	}

	static int nextPerfectSquare(int n){
		int nextPerfectSquare = 0;
		if(n >= 0){
			double sqrtResult = Math.sqrt(n);
			int baseNumber = (int)sqrtResult;
			int nextNumber = baseNumber + 1;
			nextPerfectSquare = (int)Math.pow(nextNumber, 2);
		}
		return nextPerfectSquare;
	}
}