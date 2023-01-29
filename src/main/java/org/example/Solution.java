package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int result = cutting(3,4);
        System.out.println("횟수 : "+result);

        int[] result_1 = numbers_1(5,5);
        System.out.println("숫자 리스트:");
        for (Integer integer : result_1) {
            System.out.print(integer+",");
        }
        System.out.println();
        int[] result_2 = numbers_2(5,5);
        System.out.println("숫자 리스트:");
        for (Integer integer : result_2) {
            System.out.print(integer+",");
        }
        System.out.println();

    }

    private static int[] numbers_1(int num, int total) {
        List<Integer> answer = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<num;i++){
            answer.add(i);
            sum += i;
        }
        int sNum = (total-sum)/num;
        for(int j=0; j<num;j++){
            answer.set(j,answer.get(j)+sNum);
        }
        int[] arr = answer.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    private static int[] numbers_2(int num, int total) {
        int[] answer = new int[num];

        int nSum = num * (1 + num) / 2;
        int start = (total - nSum) / num;

        for(int i=1; i<num+1; i++){
            answer[i - 1] = i + start;
        }

        return answer;
    }

    private static int cutting(int m, int n) {
        int answer = 0;
        answer = m*n-1;
        return answer;
    }



   }