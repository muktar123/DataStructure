package org.test.ds.string.pattern;

public class PatternSearch1 {

	void search(String pat, String txt)
	{
	    int M = pat.length();
	    int N = txt.length();
	    char[] pat1 = pat.toCharArray();
	    char[] txt1 =txt.toCharArray();
	  
	    /* A loop to slide pat[] one by one */
	    for (int i = 0; i <= N - M; i++)
	    {
	        int j;
	  
	        /* For current index i, check for pattern match */
	        for (j = 0; j < M; j++){
	            if (txt1[i+j] != pat1[j])
	                break;
	        }
	        if (j == M)  // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
	           System.out.printf("Pattern found at index %d \n", i);
	    }
	}
	public static void main(String[] args) {
		String txt= "i AM HERE TO TEST UR patrern";
		String pat = "TEST";
		PatternSearch1 ps1 = new PatternSearch1();
		ps1.search(pat, txt);
	}
}

