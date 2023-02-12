package org.example;

public class Coke {
    public static void main(String[] args) {
        int a=2;
        int b=1;
        int n=20;

        int answer = solution3(a,b,n);
        System.out.println(answer);
    }

    private static int solution3(int a, int b, int n){
        int answer = 0;
        while (true){
            if(n<a){
                break;
            }
            answer += (n/a)*b;
            int remain = n%a;
            n= (n/a)*b+remain;
        }
        return answer;
    }
}
