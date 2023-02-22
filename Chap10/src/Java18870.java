import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Java18870 {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] point = new int[N];
		int[] sorted = new int[N];
		for(int i=0; i<N; ++i)
			sorted[i] = point[i] = in.nextInt();
		Arrays.sort(sorted);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int rank = 0;
		for(int X: sorted) {
			if(!map.containsKey(X)) {
				map.put(X, rank);
				++rank;
			}
		}
		StringBuilder ret = new StringBuilder();
		for(int P: point) {
			int value = map.get(P);
			ret.append(value).append(' ');
		}
		System.out.println(ret);
		in.close();
	}
}