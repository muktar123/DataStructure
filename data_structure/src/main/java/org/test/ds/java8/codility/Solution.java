package org.test.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int N, int K) {
        // write your code in Java SE 8

        long res=1;
        if(K>N-K)
            K=N-K;
        for(long i=0; i<K;++i){
            res *=(N-i);
            res /= (i+1);
        }
        if(res>=1000000000) return -1;
        return (int)res;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[]={-1,-3};
      //  System.out.println(Arrays.toString(solution.solution(arr, 2)));
       // for (int i=0;i<ar.length;i++)
      //  System.out.println(ar[i]);
        System.out.println(solution.solution(5, 2));


    }
}
