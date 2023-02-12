package org.example;

public class FindeCharacter {
    public static void main(String[] args) {
        String s = "banana";
        int[] answer = solution4(s);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    private static int[] solution4(String s) {
        char[] c = new char[s.length()];
        for (int i=0;i<c.length;i++){
            c[i] = s.charAt(i);
        }
        int[] answer = new int[s.length()];
        answer[0]=-1;
        for (int j=1;j<c.length;j++){
            int cnt = 0;
            for(int k=0; k<j;k++){
                if(c[j]==c[k]){
                    cnt=j-k;
                }
            }
            if(cnt == 0){
                cnt = -1;
            }
            answer[j]=cnt;
        }
        return answer;
    }
}
