import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java1157 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int[] alphaFreq = new int[26];
		for(char C: str.toCharArray())
			++alphaFreq[C-'A'];
		
		int max = 0;
		char ret = '?';
		for(int i=0; i<alphaFreq.length; ++i) {
			if(alphaFreq[i]>max) {
				max = alphaFreq[i];
				ret = (char)(i+'A');
			}
			else if(alphaFreq[i]==max)
				ret = '?';
		}
		System.out.println(ret);
	}
}