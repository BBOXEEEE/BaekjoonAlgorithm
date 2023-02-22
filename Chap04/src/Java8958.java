import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java8958 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] results = new String[T];
		for(int t=0; t<T; ++t)
			results[t] = br.readLine();
		StringBuilder ret = new StringBuilder();
		for(int t=0; t<T; ++t) {
			int cnt = 0;
			int sum = 0;
			for(char word: results[t].toCharArray()) {
				if(word == 'O') ++cnt;
				else cnt=0;
				sum+=cnt;
			}
			ret.append(sum).append('\n');
		}
		System.out.println(ret);
	}
}

/* ver.2
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java8958 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder ret = new StringBuilder();
		for(int t=0; t<T; ++t) {
			int cnt = 0;
			int sum = 0;
			for(byte word: br.readLine().getBytes()) {
				if(word == 'O') ++cnt;
				else cnt=0;
				sum+=cnt;
			}
			ret.append(sum).append('\n');
		}
		System.out.println(ret);
	}
}
*/