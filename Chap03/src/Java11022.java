import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11022 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer str;
		
		for(int t=1; t<=T; ++t) {
			str = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(str.nextToken());
			int B = Integer.parseInt(str.nextToken());
			sb.append("Case #"+t+": ").append(A+" + "+B+" = "+(A+B)).append('\n');
		}
		System.out.println(sb);
		br.close();
	}
}