
public class Main {
	
	public static int fibo1(int num) {
		if(num <= 0) return -1;
		if(num == 1 || num == 2) return 1;
		else if(num == 3) return 2;
		
		int sum1 = 1, sum2 = 2, result = 0;
		for(int i = 4; i <= num; i++) 
		{
			result = sum1 + sum2;
			if(sum1 < sum2) sum1 = result;
			else sum2 = result;
		}
		return result;
	}
	
	public static int fibo2(int num) {
		if(num <= 0) return -1;
		else if((num == 1) || (num == 2)) return 1;
		else if(num == 3) return 2;
		else return fibo2(num - 1) + fibo2(num - 2);
	}

	public static void main(String[] args) {
		
		System.out.println("피보나치 수열 10번째는 " + fibo1(10));
		System.out.println("피보나치 수열 10번째는 " + fibo2(10));

	}

}
