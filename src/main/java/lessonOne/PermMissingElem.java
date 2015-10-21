package lessonOne;

import java.util.Arrays;

public class PermMissingElem {
	
	public int solution(int[] A) {
		
		if(A.length == 0) {
			return 1;
		}
		
		Arrays.sort(A);
				
		if(A[0] != 1) {
			return 1;
		}
		
		int exp = A[0];
		
		for(int elem : A) {
			if(elem != exp) {
				return exp;
			}
			exp++;
		}
		
		return A.length + 1;
	}

	public static void main(String[] args) {

		int [] A = {2, 3, 1, 5};
		
		System.out.println(new PermMissingElem().solution(A));

	}

}
