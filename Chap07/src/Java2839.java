import java.util.Scanner;

public class Java2839 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int ret = 0;
		while(true) {
			if(N%5==0) {
				ret += N/5;
				break;
			}
			else if(N<0){
				ret = -1;
				break;
			}
			N-=3;
			++ret;
		}
		System.out.println(ret);
		in.close();
	}
}