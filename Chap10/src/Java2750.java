import java.util.Scanner;

public class Java2750 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] numbers = new int[N];
		for(int i=0; i<N; ++i)
			numbers[i] = in.nextInt();
		// sort
		for(int i=0; i<N-1; ++i)
			for(int j=i+1; j<N; ++j) {
				if(numbers[i]>numbers[j]) {
					int tmp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = tmp;
				}
			}
		for(int num: numbers)
			System.out.println(num);
		in.close();
	}
}