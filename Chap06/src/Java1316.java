import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java1316 {
	public static boolean solution(String word) {
		boolean[] check = new boolean[26];
		char prev = ' ';
		for(char C: word.toCharArray()) {
			if(prev!=C) {
				if(!check[C-'a']) {
					check[C-'a']=true;
					prev=C;
				}
				else return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0; i<N; ++i) {
			String word = br.readLine();
			if(solution(word)) ++cnt;
		}
		System.out.println(cnt);
	}
}