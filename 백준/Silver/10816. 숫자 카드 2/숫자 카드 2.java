import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (map.get(num)!=null){
                int cnt = map.get(num)+1;
                map.put(num,cnt);
            }else {
                map.put(num,1);
            }
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<M;i++){
            int find = Integer.parseInt(st.nextToken());
            if(map.get(find)!=null){
                sb.append(map.get(find)+" ");
            }else {
                sb.append(0+" ");
            }
        }
        System.out.println(sb);
    }
}

