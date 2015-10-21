package lessonOne;

public class FrogJmp {
	
	public int solution(int X, int Y, int D) {
		
		double minDist = (double) (Y - X) / D;
		return (int) Math.ceil(minDist);
	}

	public static void main(String[] args) {
		System.out.println(new FrogJmp().solution(10, 85, 30));
	}

}
