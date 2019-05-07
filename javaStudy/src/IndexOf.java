class IndexOf2 {
	public static void main(String args[]) {
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		int idx = str.indexOf(" ");
		System.out.println(idx);
		
		idx = str.indexOf(" ", 4+1);
		System.out.println(idx);
		
		idx = str.indexOf(" ", 8+1);
		System.out.println(idx);
	
		idx = str.indexOf(" ", 12+1);
		System.out.println(idx);
		
		idx = str.indexOf(" ", 15+1);
		System.out.println(idx);


	}
}