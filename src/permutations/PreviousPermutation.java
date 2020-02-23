package permutations;

//https://leetcode.com/problems/previous-permutation-with-one-swap/
public class PreviousPermutation {

    public static void main(String[] args) {

        int[] input = {1, 1, 5};

        findPreviousPermutation(input);

        for (Integer i : input) {
            System.out.println(i);
        }

    }

    private static int[] findPreviousPermutation(int[] A) {

        int decisionIndex = A.length - 2;

        while (decisionIndex >= 0 && A[decisionIndex] <= A[decisionIndex + 1]) {
            decisionIndex--;
        }

        if (decisionIndex == -1) {
            return A;
        }

        for (int i = A.length - 1; i > decisionIndex; i--) {
            if (A[i] < A[decisionIndex] && A[i] != A[i - 1]) {
                int temp = A[i];
                A[i] = A[decisionIndex];
                A[decisionIndex] = temp;
                break;
            }
        }

        return A;
    }

}
