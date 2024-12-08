import java.util.ArrayList;
import java.util.List;

public class FindSubset {
    public List<List<Integer>> finalAnswer = new ArrayList<>();

    public void helper(int[] nums, int index, List<Integer>cominationFormedSoFar){

        //base case
        if(index==nums.length){

            finalAnswer.add(new ArrayList<>(cominationFormedSoFar));
            return;
        }


        //do not pick the number
        helper(nums, index+1, cominationFormedSoFar);

        //pick the current element
        cominationFormedSoFar.add(nums[index]);
        helper(nums, index+1, cominationFormedSoFar);
        cominationFormedSoFar.remove(cominationFormedSoFar.size()-1);


    }

    public static void main(String[] args) {
        FindSubset subSet = new FindSubset();
        subSet.helper(new int[]{1,2,3}, 0, new ArrayList<>());
        System.out.println(subSet.finalAnswer);

    }
}
