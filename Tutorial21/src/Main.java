import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Fruit box1 = new Peach(1);
		Fruit box2 = new Banana(2);
		box1.show();
		box2.show();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("세번째 박스에 담길 과일을 고르세요.");
		System.out.println("복숭아 : 1, 바나나 : 2");
		Fruit box3 = null;
		int choice = sc1.nextInt();
		switch(choice) {
		case 1:
			box3 = new Peach(3);
			break;
		case 2:
			box3 = new Banana(3);
			break;
		default:
			System.out.println("세번째 박스는 버려졌습니다.");
			box3 = new Emptybox(3);
		}
		box3.show();
		sc1.close();
	}

}
