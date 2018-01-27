package org.test.ds.stack;

public class ReverseNumber {
    public int  reverse(int x) {
    	 int result = 0;

    	    while (x != 0)
    	    {
    	        int tail = x % 10;
    	        int newResult = result * 10 + tail;
    	        if ((newResult - tail) / 10 != result)
    	        { return 0; }
    	        result = newResult;
    	        x = x / 10;
    	    }

    	    return result;
    }
    public int reverseNumber(int number){
        
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        } 
        return reverse;
    }
    public static void main(String[] args) {
		ReverseNumber rn= new ReverseNumber();
		System.out.println(rn.reverseNumber(123));
	}

}
