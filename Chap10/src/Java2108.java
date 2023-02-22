import java.util.Scanner;

public class Java2108 {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		// 정수 범위 : -4000 ~ 4000
		int[] count = new int[8001];
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 98764321;
		int mode = 987654321;
		
		// 입력 처리 및 최대, 최소 탐색 
		for(int i=0; i<N; ++i) {
			int number = in.nextInt();
			sum+=number;
			++count[number+4000];
			if(number > max) max = number;
			if(number < min) min = number;
		}
		
		int medianCount = 0;
		int modeCount = 0;
		boolean duplication = false;
		// 중앙값 및 최빈값 탐색
		for(int i = min+4000; i<=max+4000; ++i) {
			if(count[i] > 0) {
				// 중앙값 
				if(medianCount < (N+1)/2) {
					medianCount += count[i];
					median = i-4000;
				}
				// 최빈값
				if(modeCount < count[i]) {
					modeCount = count[i];
					mode = i-4000;
					duplication = true;
				}
				else if(modeCount == count[i] && duplication) {
					mode = i-4000;
					duplication = false;
				}
			}
		}
		// 결과 
		System.out.println(Math.round((double)sum/N));	// 평균
		System.out.println(median);						// 중앙값 
		System.out.println(mode);						// 최빈값 
		System.out.println(max-min);					// 범위 
		in.close();
	}
}