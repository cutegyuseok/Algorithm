/*
https://school.programmers.co.kr/learn/courses/30/lessons/134240
 */
public class lessons_134240 {
    class Solution {
        public String solution(int[] food) {
            String answer = "";
            int count =0;
            for(int i=1;i<food.length;i++){
                for(int j=0;j<(food[i]/2);j++){
                    answer += i;
                    count++;
                }
            }
            String revert = "";
            for(int i=count-1;i>=0;i--){
                revert+=answer.charAt(i);
            }
            answer +="0"+revert;
            return answer;
        }
    }
}
