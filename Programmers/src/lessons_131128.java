import java.util.*;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/131128
 */

public class lessons_131128 {
    public static void main(String[] args) {
        String X = "100";
        String Y = "2030145";
        long[] arrX = new long[10];
        long[] arrY = new long[10];
        ArrayList<Long> result = new ArrayList<>();
        getArr(X, arrX);
        getArr(Y, arrY);
        String answer = "";
        for (int i = 0; i < 10; i++) {
            if (arrX[i] > 0 && arrY[i] > 0) {
                long count = (arrX[i] <= arrY[i]) ? arrX[i] : arrY[i];
                for (int j = 0; j < count; j++) {
                    result.add((long)i);
                }
            }
        }
        if (result.size()==0) {
            answer = "-1";
        } else {
            Collections.sort(result, Collections.reverseOrder());
            int temp = 0;
            for (int i = 0; i < result.size(); i++) {
                temp += result.get(i)*Math.pow(10, result.size()-1-i);
            }
            answer=Integer.toString(temp);
        }
        System.out.println(answer);
    }

    public static void getArr(String str ,long[] arr){
        for(String a :str.split("")) {
            arr[Integer.parseInt(a)]++;
        }
    }
}
