import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동", 20, 175, 70, 20150111, 1, 4.5);
		Student student2 = new Student("이순신", 30, 170, 65, 20150112, 1, 4.4);
		student1.show();
		student2.show();
		
		Student[] students = new Student[100];
		for(int i = 0; i < 100; i++)
		{
			students[i] = new Student("홍길동", 20, 175, 70, 20200000 + i, 1, 4.5);
			students[i].show();
		}

		Teacher teacher1 = new Teacher("김선생", 20, 175, 70, "2010110", 3200000, 10);
		Teacher teacher2 = new Teacher("이선생", 30, 170, 65, "2011113", 3000000, 9);
		teacher1.show();
		teacher2.show();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇 명의 학생이 존재합니까? : ");
		int number = scan.nextInt();
		Student[] students2 = new Student[number];
		for(int i = 0; i < number; i++)
		{
			String name;
			int age;
			int height;
			int weight;
			int studentID;
			int grade;
			double gPA;
			System.out.print("학생의 이름을 입력하세요 : ");
			name = scan.next();
			System.out.print("학생의 나이를 입력하세요 : ");
			age = scan.nextInt();
			System.out.print("학생의 키를 입력하세요 : ");
			height = scan.nextInt();
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = scan.nextInt();
			System.out.print("학생의 학번을 입력하세요 : ");
			studentID = scan.nextInt();
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = scan.nextInt();
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = scan.nextDouble();
			students2[i] = new Student(name, age, height, weight, studentID, grade, gPA);
			System.out.println();
		}
		
		for(int i = 0; i < number; i++)
		{
			students2[i].show();
		}
		scan.close();
	}

}
