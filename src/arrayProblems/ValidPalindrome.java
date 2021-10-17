package arrayProblems;

public class ValidPalindrome {

	public static void main(String[] args) {
//		String str = "A man, a plan, a canal: Panama";
//		String s= "race a car";
//		String s= "0P";
		String s= "Marge, let's \"[went].\" I await {news} telegram.";
		String temp="";
		String verifyTemp="";
		for (int i=s.length()-1; i>=0; i--) {
			char ch=s.charAt(i);
			System.out.println("ch is "+ ch );
			int val=(int)ch;
			System.out.println("val is "+ val);
			
			if ((val>=65 && val<=90) ||  (val >=97  && val<=122) || (val >=48  && val<=57)) {
				temp+=ch;
			
			}
		}
		
		System.out.println(temp);
	
		for (int i=0; i<s.length(); i++ ) {
			char ch=s.charAt(i);
			int val=(int)ch;
			if ((val>=65 && val<=90) ||  (val >=97  && val<=122) || (val >=48  && val<=57)) {
				verifyTemp+=ch;
			}
		}
		System.out.println(verifyTemp);
//		boolean equalsIgnoreCase = verifyTemp.equalsIgnoreCase(temp);
		
		System.out.println(verifyTemp.equalsIgnoreCase(temp));
	}
}
//amanaplanacanalpanama