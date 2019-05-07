package collection;
import java.util.ArrayList;

public class SetExam {
	public static void main(String[] args) {
		// int -> Integer
		// float -> Float
//		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> set = new ArrayList<>();
		set.add(10);
		set.add(20);
		
		while(true)
		{
			int n = (int) (Math.random() * 45 + 1);
			set.add(n);
			if(set.size() == 6) {
				break;
			}
		}
		
		System.out.println(set);
	}
}
