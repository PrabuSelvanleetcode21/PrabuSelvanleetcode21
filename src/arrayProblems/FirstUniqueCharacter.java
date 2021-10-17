package arrayProblems;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str ="leetcode";
//		String str = "loveleetcode";
		
		String str = "aabb";
		
		int firstUniqChar = firstUniqChar(str);
		System.out.println("firstuniqChar is "+ firstUniqChar);
	}

	   public static int firstUniqChar(String s) {
		   
		   boolean flag;
		   int temp=-1;
		   HashSet<Character> sh = new HashSet<Character>();
		   for (int i=0; i<s.length(); i++) {
			   flag=false;
			   sh.add(s.charAt(i));
			   for (int j=i+1; j<s.length(); j++) {
				   char ch1 = s.charAt(i);
				   System.out.println("ch1 is "+ch1);
				   char ch2 = s.charAt(j);
				   System.out.println("ch2 is "+ch2);
				   if ((s.charAt(i)== s.charAt(j) ) && sh.contains(s.charAt(i))!=false){
					  flag=true;
					  break;
				   }
			   }
			   if (flag==false)  { 
				   System.out.println(i);
				   temp=i;
				   break;
			   }
		   }
		   
//		   System.out.println("Temp value is "+ temp);
		return temp;
	   }
	
}
