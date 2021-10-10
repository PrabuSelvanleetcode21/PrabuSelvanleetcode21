package arrayProblems;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int nums[] = {2,2,1,1,1,2,2};
		int nums[] = {3,2,3};
		int majority = majority(nums);
		System.out.println(majority);

	}

	public static int majority(int nums[]) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int count=1;
		int maj= nums.length/2;
		int finalval=0;
		for (int i=0; i<nums.length; i++) {
			
			if (!hmap.containsKey(nums[i])) {
				count=1;
				hmap.put(nums[i],count);
			} else if(hmap.containsKey(nums[i]) && hmap.get(nums[i])>=1) {
				 count=hmap.get(nums[i]);
				hmap.put(nums[i],++count);
			} 
		}
		
		for (Map.Entry<Integer, Integer> entry:  hmap.entrySet()) {
			 if(entry.getValue()> maj) {
				 finalval=  entry.getKey();
				 break;
			 }
		}
		return finalval;
	}
}
