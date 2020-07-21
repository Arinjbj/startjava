
public class Main {

	final static int SECOND = 1000;
	
	public static void main(String[] args) {
		
		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "분" + second + "초");
		
		////////
		
		int a = 10;
		System.out.println("현재의 a는 " + a + "입니다.");
		a++;
		System.out.println("현재의 a는 " + a++ + "입니다.");
		System.out.println("현재의 a는 " + ++a + "입니다.");
		
		////////
		
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		////////
		
		int x = 50;
		int y = 50;
		System.out.println("x와 y가 같은가요? : " + (x == y));
		System.out.println("x가 y보다 큰가요? : " + (x > y));
		System.out.println("x가 y보다 작은가요? : " + (x < y));
		System.out.println("x가 y와 같으면서 x가 30보다 큰가요? : " + ((x == y) && (x > 30)));
		System.out.println("x가 50이 아닌가요? : " + !(x == 50));
		
		////////
		
		int c = 50;
		int d = 60;
		
		System.out.println("최댓값은 " + max(c, d) + "입니다.");
		
		////////
		
		double e = Math.pow(3, 10);
		System.out.println("3의 10제곱은 " + (int)e + "입니다.");
		

	}
	
	//반환형, 함수 이름, 매개 변수
	static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}

}
