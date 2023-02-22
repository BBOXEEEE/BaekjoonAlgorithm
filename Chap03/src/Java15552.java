import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java15552 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int t=1; t<=T; ++t) {
			String str = br.readLine();
			int target = str.indexOf(" ");
			int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target+1));
			sb.append(result+'\n');
		}
		System.out.println(sb);
		br.close();
	}
}