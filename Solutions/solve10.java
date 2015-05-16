public class solve10{
	public static void main(String[] args){
		int[] result = solve10();
		for(int number : result){
			System.out.println(number);
		}
	}

	static int[] solve10(){
		int solve10[] = new int[2];
		int tenFactorial = 1;
		int x = 0;
		int y = 0;
		boolean factorialFound = false;
		for(int i = 1; i <= 10; i++){
			tenFactorial = tenFactorial * i;
		}
		for(x = 0; x < 10; x++){
			int xFactorial = 1;
			if(x > 0){
				for(int i = 1; i <= x; i++){
					xFactorial = xFactorial * i;
				}
			}
			for(y = 0; y < 10; y++){
				int yFactorial = 1;
				if(y > 0){	
					for(int j = 1; j <= y; j++){
						yFactorial = yFactorial * j;
					}
				}
				if(xFactorial + yFactorial == tenFactorial){
					factorialFound = true;
					break;
				}
			}
			if(factorialFound){
				break;
			}
		}
		if(x == 10 && y == 10){
			//Not Found
			x = 0;
			y = 0;
		}
		solve10[0] = x;
		solve10[1] = y;
		return solve10;
	}
}