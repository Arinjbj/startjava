
public class Main {

	final static int NUMBER = 15;
	
	public static void main(String[] args) {
		
		int score = 75;
		
		if(score >= 90)
		{
			System.out.println("A+입니다.");
		}
		else if(score >= 80)
		{
			System.out.println("B+입니다.");
		}
		else if(score >= 70)
		{
			System.out.println("C+입니다.");
		}
		else
		{
			System.out.println("F입니다.");
		}
		
		////////
		
		String a = "Man";
		int b = 0;
		
		// 자바는 String을 비교할 때 equal()을 이용합니다.
		// String은 클래스 기반의 비원시자료형이기 때문입니다.
		if(a.equals("Man"))
		{
			System.out.println("남자입니다.");
		}
		else
		{
			System.out.println("남자가 아닙니다.");
		}
		if(b == 3)
		{
			System.out.println("b는 3입니다.");
		}
		else
		{
			System.out.println("b는 3이 아닙니다.");
		}
		
		if(a.equalsIgnoreCase("man") && b == 0)
		{
			System.out.println("참입니다.");
		}
		else
		{
			System.out.println("거짓입니다.");
		}
		
		////////
		
		int i = 1, sum = 0;
		while(i <= 1000)
		{
			sum += i++;
		}
		System.out.println("1부터 1000까지의 합은 : " + sum);
		
		////////
		
		for(int j = NUMBER; j > 0; j--)
		{
			for(int k = j; k > 0; k--)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		////////
		
		// x^2 + y^2 = r^2
		for(i = -NUMBER; i <= NUMBER; i++)
		{
			for(int j = -NUMBER; j <= NUMBER; j++)
			{
				if((i * i) + (j * j) <= NUMBER * NUMBER)
				{
					System.out.print("*");
					System.out.print(" ");
					System.out.print(" ");
				}
				else
				{
					System.out.print(" ");
					System.out.print(" ");
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	
}
