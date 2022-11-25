/*
https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */
import java.util.*;
public class lessons_1845 {

    class Solution {
        public int solution(int[] nums) {
            HashSet<Integer> list = new HashSet<Integer>();
            for(int i=0;i<nums.length;i++){
                list.add(nums[i]);
            }
            int answer = (nums.length/2);
            if(list.size()<answer)answer=list.size();
            return answer;
        }
    }

}
