
public class Main {
	
	// 5! = 5 * 4 * 3 * 2 * 1 = 120
	public static int facto1(int num) {
		int sum = 1;
		for(int i = 2; i <= num; i++)
		{
			sum *= i;
		}
		return sum;
	}
	
	public static int facto2(int num) {
		if(num == 1) return 1;
		else return num * facto2(num - 1);
	}

	
	public static void main(String[] args) {
		
		System.out.println("10 팩토리얼은 " + facto1(10));
		System.out.println("10 팩토리얼은 " + facto2(10));

	}

}
