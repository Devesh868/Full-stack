package hello;

import java.util.*;

import static java.lang.Math.min;

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;  // To store the maximum area
        int left = 0;
        int right = height.length - 1;

        while(left<right){
            int width = right-left;
            int currentHeight = min(height[left], height[right]);
            int area = width*currentHeight;

            maxArea = Math.max(maxArea,area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
public class qu {
    public static void main(String[] args) {
        int []arr = {8,7,2,1};
        Solution s = new Solution();
        int k = s.maxArea(arr);
        System.out.println(k);
    }
}
