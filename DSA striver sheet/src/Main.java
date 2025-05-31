import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int []majorityElement(int[] nums) {
       Stack<Integer>stack = new Stack<>();
       int []result = new int[nums.length];
               Arrays.fill(result,-1);
        for (int i = 0; i < nums.length ; i++) {
            while (!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                int index = stack.pop();
                result[index] = nums[i];
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 8, 7, 1, 2, 3,100};
        Solution s = new Solution();
        int []arr = s.majorityElement(nums1);
        for (int i:arr){
            System.out.println(i);
        }

    }
}




