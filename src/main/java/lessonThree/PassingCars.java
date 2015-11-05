package lessonThree;

public class PassingCars {

    public int solution(int[] A) {

        int passing = 0;
        int east = 0;

        for (int i = 0; i < A.length; ++i) {
            if (A[i] == 1) {
                passing += east;

                if (passing > 1000000000) {
                    return -1;
                }
            }
            else {
                east += 1;
            }
        }

        return passing;
    }

    public static void main(String[] args) {

        int[] A = {0, 1, 0, 1, 1};
        System.out.println(new PassingCars().solution(A));
    }

}
