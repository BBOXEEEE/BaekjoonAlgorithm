import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Java10809 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alphaFreq = new int[26];
		Arrays.fill(alphaFreq, -1);
		int index = 0;
		for(var alpha: br.readLine().toCharArray()) {
			if(alphaFreq[alpha-'a'] == -1) alphaFreq[alpha-'a'] = index;
			++index;
		}
		for(var ret: alphaFreq)
			System.out.print(ret + " ");
	}
}