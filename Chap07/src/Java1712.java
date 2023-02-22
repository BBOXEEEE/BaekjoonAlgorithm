import java.util.Scanner;

public class Java1712 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();	// 고정비용 
		int B = in.nextInt();	// 가변비용 
		int C = in.nextInt();	// 제품가격 
		if(B>=C) System.out.println(-1);
		else System.out.println(A/(C-B)+1);
		in.close();
	}
}