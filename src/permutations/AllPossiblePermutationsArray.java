package permutations;


//Given a collection of distinct integers, return all possible permutations.

//https://www.youtube.com/watch?v=KukNnoN-SoY

import java.util.ArrayList;
import java.util.List;

public class AllPossiblePermutationsArray {

    public static void main(String[] args) {

//        Integer[] numbers = {1, 2, 3};
        int[] nums = {1, 2, 3};
        List<List<Integer>> allPossibilities = permute(nums);
        System.out.println(allPossibilities);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findPermutations(nums, new ArrayList<>(), result);
        return result;
    }

    private static void findPermutations(int[] nums, ArrayList<Integer> currentSet, List<List<Integer>> result) {
        if (currentSet.size() == nums.length) {
            result.add(new ArrayList<>(currentSet));
        }

        //recursive solution.

        for (int i = 0; i < nums.length; i++) {
            if (currentSet.contains(nums[i])) continue; // to check is number already added to currentset.
            currentSet.add(nums[i]);
            findPermutations(nums, currentSet, result);
            currentSet.remove(currentSet.size() - 1);
        }
    }

}
