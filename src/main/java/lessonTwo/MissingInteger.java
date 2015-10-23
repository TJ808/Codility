package lessonTwo;

public class MissingInteger {
	
	public int solution(int[] A) {
		
		boolean [] counter = new boolean[A.length + 1];
		
		/* populate counter array. We only care about positive numbers and numbers
		 * less than or equal to the length of the original array. Numbers with values
		 * greater than the original array are irrelevant since it won't be possible
		 * to reach them without skipping a lower number first.
		 */
		
		for(int i = 0; i < A.length; ++i) {
			if(A[i] > 0 && A[i] <= A.length && counter[ A[i] ] == false) {
				counter[ A[i] ] = true;
			}
		}
		
		
		/* loop through counter array. First element at position j that is
		 * not true is the minimal missing integer
		 */
		
		for(int j = 1; j < counter.length; ++j) {
			if(counter[j] != true) {
				return j;
			}
		}

		// If no numbers were skipped the missing number is 1 + original array length or (counter.length)
		return counter.length;
	}

	public static void main(String[] args) {

		int [] A = {1, 3, 6, 4, 5, 2};
		System.out.println(new MissingInteger().solution(A));
	}
}
