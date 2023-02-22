import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1546 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] scores = new int[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int max = Integer.MIN_VALUE;
		double sum = 0.0;
		for(int i=0; i<scores.length; ++i) {
			scores[i] = Integer.parseInt(st.nextToken());
			if(scores[i]>max) max=scores[i];
			sum+=scores[i];
		}
		System.out.println(((sum/max)*100.0) / scores.length);
	}
}