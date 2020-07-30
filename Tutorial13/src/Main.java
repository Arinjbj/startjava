import java.util.Scanner;

public class Main {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		
		int[] arr2 = new int[100];
		for(int i = 0; i < 100; i++)
		{
			arr2[i] = (int)(Math.random() * 100 + 1);
		}
		int sum = 0;
		for(int i = 0; i < 100; i++)
		{
			sum += arr2[i];
		}
		System.out.println("100개의 랜덤 정수의 평균 값은 " + sum / 100 + "입니다.");
		
		////////
		
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요 : ");
		int number = sc.nextInt();
		int[] arr = new int[number];
		for(int i = 0; i < number; i++)
		{
			System.out.print(i + "번 배열에 들어갈 정수를 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
		int result = -1;
		for(int i = 0; i < number; i++)
		{
			result = max(result, arr[i]);
		}
		System.out.println("배열의 숫자 중 가장 큰 값은 " + result + "입니다.");
		sc.close();

	}

}
