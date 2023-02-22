import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java4344 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=0; t<T; ++t) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int[] scores = new int[N];
			double sum = 0.0;
			for(int i=0; i<N; ++i) {
				scores[i] = Integer.parseInt(st.nextToken());
				sum+=scores[i];
			}
			double avg = sum/N;
			double rate = 0.0;
			for(var score: scores)
				if(score>avg) ++rate;
			System.out.printf("%.3f%%\n", (rate/N)*100);
		}
	}
}