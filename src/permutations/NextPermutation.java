package permutations;

//https://leetcode.com/problems/next-permutation/

public class NextPermutation {

    public static void main(String[] args) {

        int[] nums = {5, 1, 1};

        findNextPermutation(nums);
        for (Integer i : nums) {
            System.out.println(i);
        }
    }

    // if arr in decending order just reverse.
    // look for point where the value stops increasing(right to left)
    // swap this number with the next biggest number in the sequence
    // and sort the remaining array .

    private static void findNextPermutation(int[] nums) {

        int decisionIndex = nums.length - 1;

        if (decisionIndex == 0) {
            return;
        }

        while (nums[decisionIndex] <= nums[decisionIndex - 1]) {
            if (decisionIndex == 1) {
                sortArray(nums, 0, nums.length - 1);
                return;
            }
            decisionIndex--;
        }

//        if (decisionIndex ==1){
//            return;
//        }


        for (int i = nums.length - 1; i > decisionIndex - 1; i--) {

            if (nums[i] > nums[decisionIndex - 1]) {
                int temp = nums[i];
                nums[i] = nums[decisionIndex - 1];
                nums[decisionIndex - 1] = temp;
                break;
            }

        }

        sortArray(nums, decisionIndex, nums.length - 1);

    }

    private static void sortArray(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
//        for (Integer i : nums) {
//            System.out.println(i);
//        }
    }


}
