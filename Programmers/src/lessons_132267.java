/*
https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */
public class lessons_132267 {
    class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;
            while(n>=a){
                n-=a;
                n+=b;
                answer+=b;
            }
            return answer;
        }
    }
}
