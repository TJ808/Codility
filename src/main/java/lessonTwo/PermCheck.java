package lessonTwo;

public class PermCheck {

	public int solution(int [] A) {
		
		//Store size of Array A
		int size = A.length;
		
		//Declare and intialize counter array with size equal to array A
		int [] counter = new int[size];
		
		for(int i = 0; i < size; ++i) {

			/* Since the problem states a permutation contains each element
			from 1 to N once and only once, we have two checks. The first is
			to check if any element in array A has a value greater than the size
			of array A. If it does this is not a permutation since a permutation
			must start with 1. If an elements value is greater than the number of 
			elements in the array, a permutation is not possible. The second check
			makes sure each element only appears once. If it appears more than once
			it is not a permutation */
			
			if(A[i] <= size && counter[ A[i] - 1] == 0) {
				counter[ A[i] - 1] = 1;
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
