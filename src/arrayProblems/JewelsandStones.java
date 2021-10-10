package arrayProblems;

public class JewelsandStones {

	public static void main(String[] args) {
		String jewels = "aA"; 
		String stones = "aAAbbbb";
		int count=0;
	

		for (int i=0; i<stones.length(); i++) {
			System.out.println(stones.charAt(i));
			char ch=stones.charAt(i);
			String string = String.valueOf(ch);
			if (jewels.contains(string)) {
				count++;
			}
		}
		System.out.println("Count is "+ count);
	}
}
