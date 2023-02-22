import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java2438 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; ++i) {
			for(int j=0; j<=i; ++j)
				sb.append("*");
			sb.append('\n');
		}
		System.out.println(sb);
	}
}