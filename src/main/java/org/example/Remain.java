package org.example;

public class Remain {
    public static void main(String[] args) {
        int n= 10;
        int answer = solution2(n);
        System.out.println(answer);
    }

    private static int solution2(int n) {
        for (int i =1; i<n ; i++){
            if (n % i ==1){
                return i;
            }
        }
        return 0;
    }
}
