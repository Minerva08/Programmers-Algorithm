package org.example;

public class Three {
    public static void main(String[] args) {
        int[] number = {-2,3,0,2,-5};
        int answer = solution(number);
        System.out.println(answer);
    }

    private static int solution(int[] number) {
        int answer=0;
        for (int i=0; i<number.length-2;i++){
            for (int j=i+1; j<number.length-1;j++){
                for (int k=j+1; k<number.length;k++){
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
