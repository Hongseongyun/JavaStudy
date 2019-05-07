package inheritance;

public class Main {
	public static void main(String[] args) {
		Child1[] cc1 = new Child1[2];
		
		Child1 c1 = new Child1();
		c1.b();
		cc1[0] = c1;
		
		Child2 c2 = new Child2();
		c2.b();
		cc1[1] = c2; // Child1배열에 Child2 객체를 넣을 수 없음
		
		Parent[] pp1 = new Parent[2];
		Child1 p1 = new Child1();
		pp1[0] = p1;
		Child2 p2 = new Child2();
		pp1[1] = p2;
		// 다용성(자식함수가 부모함수가 될 수 있다.)
		
		
		
		Child1 c1 = new Child1();
		c1.b();
		Child1 c2 = new Child2();
		c2.b();
	}
}
