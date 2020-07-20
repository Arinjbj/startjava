
public class Main {

	public static void main(String[] args) {
		
		double n1 = 100.3;
		double n2 = 99.6;
		double n3 = 100.1;
		
		System.out.println((n1 + n2 + n3) / 3);
		
		
		for(char i = 'a'; i <= 'z'; i++)
		{
			System.out.format("%c ", i);
		}
		System.out.println();
		
		
		int a = 200;
		
		System.out.println("10진수 : " + a);
		System.out.format("8진수 : %o\n", a);
		System.out.format("16진수 : %X", a);
		
		
		String name = "Arin JBJ";
		System.out.println(name);
		System.out.println(name.substring(0, 1));
		System.out.println(name.substring(3, 6));
		System.out.println(name.substring(5, 8));
		System.out.println(name.substring(0, 4));

	}

}
