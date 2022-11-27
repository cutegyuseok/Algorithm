public class lessons_133499 {
    public static void main(String[] args) {
        String[] babbling={"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        String[] arr = {"aya", "ye", "woo", "ma"};
        String[] doubleArr = {"ayaaya", "yeye", "woowoo", "mama"};
        int answer =0;
        for(int i=0;i<babbling.length;i++){
            for(int j=0;j<arr.length;j++){
                babbling[i]=babbling[i].replace(doubleArr[j],"X");
            }
            for(int j=0;j<arr.length;j++){
                babbling[i]=babbling[i].replace(arr[j]," ");
            }
            babbling[i]=babbling[i].replace(" ","");
            if (babbling[i]=="") answer++;
        }
        System.out.println(answer);
    }
}
