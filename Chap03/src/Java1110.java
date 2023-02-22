import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java1110 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt=0;
		int cmp=N;
		do {
			N = ((N%10)*10) + (((N/10)+(N%10))%10);
			++cnt;
		} while(cmp!=N);
		System.out.println(cnt);
	}
}