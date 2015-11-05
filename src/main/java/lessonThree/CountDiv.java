package lessonThree;

public class CountDiv {

    public int solution(int A, int B, int K) {

        int offset = (A % K == 0 ? 1 : 0);
        int left = (A / K) - offset;
        int right = B / K;

        return right - left;
    }

    public static void main(String[] args) {
        System.out.println(new CountDiv().solution(6, 11, 2));
        System.out.println(new CountDiv().solution(2, 10, 2));
    }

}
