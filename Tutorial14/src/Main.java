
public class Main {

	public static void main(String[] args) {
		
		int n = 50;
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				arr[i][j] = (int)(Math.random() * 10);
			}
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(arr[i][j]);
				System.out.print(" ");
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
