import java.util.Scanner;

public class p2439 {
        /*
        첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
        첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
         */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int starNum = sc.nextInt();
            String star ="*";
            String empty=" ";
            for(int cnt =0;cnt<starNum;cnt++) {
                for(int i=0;i<starNum-cnt-1;i++){
                    System.out.print(empty);
                }
                for (int i = 0;i<cnt+1;i++){
                    System.out.print(star);
                }
                System.out.println();
            }
    }
}
