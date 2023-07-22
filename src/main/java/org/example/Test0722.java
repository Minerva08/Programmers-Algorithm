package org.example;

public class Test0722 {

    public static void main(String[] args) {
        int result = solution("500015324","13");
        System.out.println(result);
    }
    private static int solution(String t, String p) {
        int answer = 0;
        int pLeng = p.length();
        Long pNum= Long.parseLong(p);
        for(int i=0; i<t.length()-pLeng+1; i++){
            Long intSubT=Long.parseLong(t.substring(i,i+pLeng));
            if(pNum>=intSubT) answer++;
        }        return answer;
    }


}
