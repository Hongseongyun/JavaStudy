//Shift + ctrl + F : 소스코드 정렬

public class Variable1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.printf("a의 값은? %d\n", a);
		
		System.out.println("a의 값은? " + a);

		int b = 11;
		System.out.println("b의 값은? " + b);

		// a의 값에 b를 입력
		// 기존 a의 값읶 10은 사라짐
		a = b;
		System.out.println("a의 값은? " + a);
	}
}