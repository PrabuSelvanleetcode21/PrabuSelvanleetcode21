package stringProblems;

import java.util.Arrays;

public class Sortingthesentence {

	public static void main(String[] args) {
		
		String str = "is2 sentence4 This1 a3";
		
		sortSentence(str);
		
	}
	
	public static void sortSentence(String str) {
		
		String[] split = str.split(" ");
		
//		Arrays.sort(split);
		String temp="";
	 int k=0;
		
		for (String s: split) {
//			System.out.println(s);
			String substring = s.substring(0, s.length()-1);
			split[k] =substring;
			k++;
		}
		
		Arrays.sort(split);
		for (String m: split) System.out.println(m);
		
		
		
		
		
	}
}
