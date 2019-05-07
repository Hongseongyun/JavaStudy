
public class NetworkMain {
	public static void main(String[] args) {
		NetworkUtil nu = new NetworkUtil();
		String result = nu.get("https://dhlottery.co.kr/gameResult.do?method=byWin&drwNo=857");
		
		int s_idx = result.indexOf("<p>");
		int e_idx = result.indexOf("</p>", s_idx);
		String data = result.substring(s_idx, e_idx);
		System.out.println(data);
		
		//<span class="ball_645 lrg ball1">6</span>]
		e_idx = 0; // 초기화
		String lotto = "";
		while(true)
		{
		s_idx = data.indexOf("<span class=", e_idx);
		if(s_idx == -1) break;
		s_idx = data.indexOf(">", s_idx);
		e_idx = data.indexOf("<", s_idx);
		String s = data.substring(s_idx+1, e_idx);
		
		lotto += (s.length() < 2) ? "0" + s : s; // 한자리 정수를 두자리로 표현
		
		s_idx = e_idx;
		}
		System.out.println(lotto);
	}
}
