public class lessons_136798 {
    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/136798
     */
    class Solution {
        public int solution(int number, int limit, int power){
            int answer = 0;
            for(int i=1;i<=number;i++){
                int count =0;
                int k=(i>10)?((i/2)+1):i;
                for(int j=1;j<=k;j++){
                    if(i%j==0){
                        count++;
                        if(count>limit)break;
                    }
                }
                if(i>10)count++;
                answer+= (count>limit)?power:count;
            }
            return answer;
        }
    }
}
