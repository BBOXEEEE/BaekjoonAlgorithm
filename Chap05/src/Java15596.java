
public class Java15596 {
	public static long sum(int[] a) {
		long ans = 0;
		for(int num: a)
			ans+=num;
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println(sum(nums));
	}
}