package permutations;


import java.util.ArrayList;
import java.util.List;

//Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.
public class LetterCasePermutation {

    public static void main(String[] args) {

        String s = "a1B2";

        List<String> answers = new ArrayList<>();
        findCasePermutations(s.toCharArray(), answers, 0);
//        compute(answers,s.toCharArray(),0);
        System.out.println(answers);

    }

    private static void findCasePermutations(char[] s, List<String> answers, int charPosition) {
        if (charPosition == s.length) {
            answers.add(new String(s));
        } else {
            if (Character.isLetter(s[charPosition])) {
                s[charPosition] = Character.toUpperCase(s[charPosition]);
                findCasePermutations(s, answers, charPosition + 1);
                s[charPosition] = Character.toLowerCase(s[charPosition]);

            }
            findCasePermutations(s, answers, charPosition + 1);
        }
    }

}
