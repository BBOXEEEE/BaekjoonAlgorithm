import java.util.Scanner;

public class Java2587 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = 5;
		int[] numbers = new int[N];
		for(int i=0; i<N; ++i)
			numbers[i] = in.nextInt();
		int sum = 0;
		for(int num: numbers)
			sum+=num;
		for(int i=0; i<N-1; ++i) {
			for(int j=i+1; j<N; ++j) {
				if(numbers[i]>numbers[j]) {
					int tmp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = tmp;
				}
			}
		}
		System.out.println(sum/N);
		System.out.println(numbers[2]);
		in.close();
	}
}