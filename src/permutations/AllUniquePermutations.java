package permutations;

import java.util.ArrayList;
import java.util.List;

//Given a collection of numbers that might contain duplicates, return all possible unique permutations.

//Assume array is sorted.
public class AllUniquePermutations {

    public static void main(String[] args) {

//        Integer[] numbers = {1, 2, 3};
        int[] nums = {1, 2, 2, 2};
        List<List<Integer>> allPossibilities = permute(nums);
        System.out.println(allPossibilities);
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answers = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        findPermutations(nums, new ArrayList<>(), visited, answers);

        return answers;
    }

    private static void findPermutations(int[] nums, List<Integer> currentSet, boolean[] visited, List<List<Integer>> result) {
        if (currentSet.size() == nums.length) {
            result.add(new ArrayList<>(currentSet));
        }

        //recursive solution.
//        Assume array is sorted

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue; // to check is number already added to currentset.
            currentSet.add(nums[i]);
            visited[i] = true;
            findPermutations(nums, currentSet, visited, result);
            currentSet.remove(currentSet.size() - 1);
            visited[i] = false;

            while (i + 1 < nums.length && nums[i] == nums[i + 1])   //to remove computation for repeating number
                i++;
        }
    }

}
