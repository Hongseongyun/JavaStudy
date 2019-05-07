
public class start1 {
	public static void main(String[] args) {
		int space = 5;
		for(int i = 0;i<5;i++) {
			space = space - 1;
			for(int j = 0; j <5; j++) {
				if(j>space-1) {
					System.out.print("*");
				}
					else {
						System.out.print(" ");
					}
				}
			System.out.println("\n");
			}
		}
		
}
