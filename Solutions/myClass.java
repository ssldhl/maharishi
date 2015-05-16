public class myClass{
	public static void main (String[] args) throws java.lang.Exception{
		int[] result = solve10();
		for(int number : result){
			System.out.print(number + ", ");
		}
	}

	public static int[] solve10(){
		int[] result = new int[]{2,2};
		int factorial10=10*9*8*7*6*5*4*3*2;
		int factorial1=1;
		int factorial2=1;
		do{
			factorial2=1;
			for(int i = result[0] ; i>0 ;i--) 
				factorial2=factorial2*i;
			result[1]=1;
			if(factorial2>factorial10) return(new int[]{0,0});
			do{
				factorial1=1;
				for(int i = result[1] ; i>0 ;i--) 
					factorial1=factorial1*i;
				if(factorial1+factorial2>=factorial10) break;
				result[1]++;
			}while(true);
			if(factorial1+factorial2==factorial10) break;
			result[0]++;
		}while(true);
		return result;
  	}
}