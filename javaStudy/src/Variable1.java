//Shift + ctrl + F : �ҽ��ڵ� ����

public class Variable1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.printf("a�� ����? %d\n", a);
		
		System.out.println("a�� ����? " + a);

		int b = 11;
		System.out.println("b�� ����? " + b);

		// a�� ���� b�� �Է�
		// ���� a�� ���� 10�� �����
		a = b;
		System.out.println("a�� ����? " + a);
	}
}