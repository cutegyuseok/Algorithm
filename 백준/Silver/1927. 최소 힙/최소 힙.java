import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> myHeap = new PriorityQueue<>();
        /* 한번 풀어보세요~ */
        for (int i=0;i<N;i++){
            int a = Integer.parseInt(br.readLine());
            if (a!=0){
                myHeap.add(a);
            }else {
                if (myHeap.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(myHeap.poll());
                }
            }
        }
    }
}