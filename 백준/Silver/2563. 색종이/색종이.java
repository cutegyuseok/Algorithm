import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] page = new int[100][100];
        for (int i=0;i<num;i++){
            int width = sc.nextInt();
            int length = sc.nextInt();
            for (int k=0;k<10;k++) {
                for (int j = 0; j < 10; j++) {
                    page[99 - length-k][width + j] = 1;
                }
            }
        }
        int answer = 0;
        for (int i=0;i<100;i++){
            for (int j=0;j<100;j++){
               answer+=page[i][j];
            }
        }
        System.out.println(answer);
    }
}
