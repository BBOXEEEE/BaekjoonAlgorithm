import java.util.PriorityQueue;
import java.util.Scanner;

public class Java2571 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] numbers = new int[N];
		for(int i=0; i<N; ++i)
			numbers[i] = in.nextInt();
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		for(int num: numbers)
			heap.add(num);
		for(int i=0; i<N; ++i)
			numbers[i] = heap.poll();
		StringBuilder ret = new StringBuilder(N);
		for(int num: numbers)
			ret.append(num).append('\n');
		System.out.println(ret);
		in.close();
	}
}