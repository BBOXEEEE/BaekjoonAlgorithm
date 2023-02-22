import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Java3052 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] check = new boolean[42];
		for(int i=0; i<10; ++i)
			check[Integer.parseInt(br.readLine())%42] = true;
		int cnt = 0;
		for(var C: check)
			if(C) ++cnt;
		System.out.println(cnt);
	}
}