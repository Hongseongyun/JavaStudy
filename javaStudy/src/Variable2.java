//Shift + ctrl + F : 소스코드 정렬

public class Variable2 {
	public static void main(String[] args) {
		// 0.0 <= x <1.0
		double r = Math.random() * 6; // 0.0 ~ 5.9999999999
		r = r + 1;
		int num = (int)r ;
		System.out.println(num);
		int num2 = (int) (Math.random() * 6 + 1);
		System.out.println(num2);
		long ut = System.currentTimeMillis();
		System.out.println(ut);
		
	}
}