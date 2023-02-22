import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java2439 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int r=1; r<=N; ++r) {
			for(int i=0; i<N-r; ++i)
				sb.append(" ");
			for(int i=0; i<r; ++i)
				sb.append("*");
			sb.append('\n');
		}
		System.out.println(sb);
	}
}