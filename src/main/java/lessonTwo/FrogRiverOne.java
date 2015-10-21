package lessonTwo;

public class FrogRiverOne {
	
	public int solution(int X, int[] A) {
		
		int uniqueCheck = 0;
		int[] positions = new int[X + 1];
		
		for(int i = 0; i < A.length; ++i) {
			if(positions[A[i]] == 0) {
				uniqueCheck++;
				positions[A[i]] = 1;
			}
			if(uniqueCheck == X) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int [] A = {1, 3, 1, 4, 2, 3, 5, 4};
		System.out.println(new FrogRiverOne().solution(5, A));
	}

}
