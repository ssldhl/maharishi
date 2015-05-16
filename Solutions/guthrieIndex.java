public class guthrieIndex{
	public static void main(String[] args){
		int result = guthrieIndex(1);
		System.out.println(result);
		result = guthrieIndex(2);
		System.out.println(result);
		result = guthrieIndex(3);
		System.out.println(result);
		result = guthrieIndex(4);
		System.out.println(result);
		result = guthrieIndex(42);
		System.out.println(result);
	}

	static int guthrieIndex(int n){
		int guthrieIndex = 0;
		if(n > 1){
			while(n != 1){
				if(n % 2 == 0){
					n = n / 2;
				}else{
					n = n * 3 + 1;
				}
				guthrieIndex ++;
			}
		}
		return guthrieIndex;
	}
}