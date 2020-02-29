package main.com.hackerrank.warmup;

public class SimpleArraySum {

	
	static int simpleArraySum(int[] arr) {
        int SUM = 0;
        for (int i = 0; i < arr.length; i++) {
			SUM+=arr[i];
		}
        return SUM;
    }
	
	public static void main(String[] args) {
		int[] arr = new int[] {1 ,2, 3 ,4 ,10 ,11};
		System.out.println(simpleArraySum(arr));
	}
	
}
