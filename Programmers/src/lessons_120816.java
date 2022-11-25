/*
https://school.programmers.co.kr/learn/courses/30/lessons/120816
 */
public class lessons_120816 {
    class Solution {
        public int solution(int slice, int n) {
            int answer = 0;
            int count =0;
            while(count<n){
                count+=slice;
                answer++;
            }
            return answer;
        }
    }
}
