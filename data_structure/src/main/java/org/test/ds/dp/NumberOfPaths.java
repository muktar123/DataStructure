package org.test.dp;

import java.util.Date;

public class NumberOfPaths {
	
	static int numberOfPaths(int m, int n) { 
		if(m==1 || n==1) return 1;
		return numberOfPaths(m, n-1) + numberOfPaths(m-1, n);
	}

	static int numberOfPathsUsingDp(int m, int n) { 
	 int count[][] = new int[m][n]; 
	  
    for (int i = 0; i < m; i++) 
        count[i][0] = 1; 

    for (int j = 0; j < n; j++) 
        count[0][j] = 1; 

    for (int i = 1; i < m; i++) { 
        for (int j = 1; j < n; j++)  
            count[i][j] = count[i - 1][j] + count[i][j - 1] ;// for diogonal count[i-1][j-1]; 
    } 
    return count[m - 1][n - 1]; 
} 
    public static void main(String args[]) 
    { 
		System.out.println(new Date());
        System.out.println(numberOfPathsUsingDp(20, 16)); 
		System.out.println(new Date());
        System.out.println(numberOfPaths(20, 16)); 
		System.out.println(new Date());

    } 

}
