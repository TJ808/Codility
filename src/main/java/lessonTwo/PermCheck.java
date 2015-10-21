package lessonTwo;

public class PermCheck {

	public int solution(int [] A) {
		
		int size = A.length;
		int [] counter = new int[size + 1];
		
		for(int i = 0; i < size; ++i) {

			if(A[i] <= size && counter[ A[i] ] == 0) {
				counter[ A[i] ] = 1;
			}
			else {
				return 0;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		int [] A = {4, 1, 3, 2};
		System.out.println(new PermCheck().solution(A));
	}
}
