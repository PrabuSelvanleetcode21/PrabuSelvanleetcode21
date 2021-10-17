package stringProblems;

public class IsAnagram {

	public static void main(String[] args) {
		
		String s = "anagram";
		String t = "nagaram1";
		
		boolean anagram = Anagram(s, t);
		System.out.println(anagram);
		
	}
	
	private static boolean Anagram(String s, String t) {
		
		if (s.length()!=t.length()) return false;
		int temp[]  = new int [256];
		for (int i=0; i<s.length(); i++) {
			
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			
			temp[ch1]++;
			temp[ch2]--;
		}
		
		for (int i=0; i< temp.length; i++) {
			if (temp[i]!=0 ) return false;
		}
		
		return true;
	}
}
