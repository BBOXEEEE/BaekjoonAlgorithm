import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Java11650 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] pos = new int[N][2];
		for(int i=0; i<N; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			pos[i][0] = Integer.parseInt(st.nextToken());
			pos[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(pos, (o1, o2) -> {
			if(o1[0] == o2[0]) return o1[1]-o2[1];
			else return o1[0]-o2[0];
		});
		StringBuilder ret = new StringBuilder();
		
		for(int[] X: pos) {
			for(int Y: X)
				ret.append(Y + " ");
			ret.append('\n');
		}
		System.out.println(ret);
	}
}