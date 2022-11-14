import java.util.Scanner;

/*
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 */
public class p1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for(int i=1;i<= N;i++){
            if(i<100){
                cnt++;
            }else if(i<1000){
                if(check(i))cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean check (int i){
        int a = i/100;
        int b = (i-a*100)/10;
        int c = i-a*100-b*10;
        if (a-b==b-c)return true;
        else return false;
    }
}
