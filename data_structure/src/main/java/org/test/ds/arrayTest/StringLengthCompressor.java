package org.test.ds.arrayTest;

public class StringLengthCompressor {
	
	public static String StringCompressor(String str){
		int cnt=0;
		StringBuilder sb = new  StringBuilder();
		for(int i=0;i<str.length();i++){
			cnt++;
			if(i+1>=str.length() ||str.charAt(i)!=str.charAt(i+1)){
	
				sb.append(str.charAt(i));
				sb.append(cnt);
				cnt=0;
			}
		}
		return sb.length() < str.length() ? sb.toString() : str;
	}
	public static void main(String[] args) {
		System.out.println(StringCompressor("aabbb"));
	}

}
