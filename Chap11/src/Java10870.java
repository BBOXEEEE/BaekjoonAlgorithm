import java.util.Scanner;

public class Java10870 {
	public static int fibo(int N) {
		if(N==0) return 0;
		if(N<=2) return 1;
		return fibo(N-1)+fibo(N-2);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(fibo(N));
		in.close();
	}
}