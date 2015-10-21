package lessonOne;

public class TapeEquilibrium {
	
	public int solution(int[] A) {
		
		int diff = Integer.MAX_VALUE;
		int sum = 0;
		
		for(int x : A) {
			sum += x;
		}
		
		int firstHalf = 0;
		int secondHalf = sum;
		
		for(int i = 0; i < A.length - 1; ++i) {

			firstHalf += A[i];			
			secondHalf = secondHalf - A[i];
			
			int currentDiff = Math.abs(firstHalf - secondHalf);
			
			if(currentDiff < diff ) {
				diff = currentDiff;
			}
		}
		return diff;
	}

	public static void main(String[] args) {
		
		int[] A = {3, 1, 2, 4, 3};
		System.out.println(new TapeEquilibrium().solution(A));
	}
}
