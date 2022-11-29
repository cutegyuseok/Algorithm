/*
https://school.programmers.co.kr/learn/courses/30/lessons/131705
 */
public class lessons_131705 {
    class Solution {
        public int solution(int[] number) {
            int answer = 0;
            for(int i=0;i<number.length;i++){
                for(int j=(i+1); j<number.length;j++){
                    for(int l=(j+1); l<number.length;l++){
                        if(number[i]+number[j]+number[l]==0)answer++;
                    }
                }
            }
            return answer;
        }
    }
}
