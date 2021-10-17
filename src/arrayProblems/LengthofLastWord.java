package arrayProblems;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String str = "Hello World";
//		String str ="   fly me   to   the moon  ";
		String str = "luffy is still joyboy";
		lastwordlength(str);
		
	}
	
	public static int lastwordlength(String str) {
		
		String[] split = str.split(" ");
		String temp =split[split.length-1];
		
		return temp.length();		
	}

	
}
