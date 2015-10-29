package duplicates;

import java.util.HashSet;

class InputException extends Exception{
	
}

//find if the array contains any duplicates
public class FindDuplicates {
	public boolean containsDuplicate(int[]nums) throws InputException{
		//throw exception,array should contain two or more numbers
		if(nums.length<=1){
			InputException ie=new InputException();
			throw ie;
		}
		//add nums to hashset named numHash
		HashSet<Integer> numHash=new HashSet<Integer>();
		for(int num:nums){
			numHash.add(num);
		}
		//hashset have no duplicates, so we can compare sizes to see if nums contain duplicates
		if(numHash.size()==nums.length){
			return false;
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		int[]nums=new int[]{1,1,1,2,2};
		FindDuplicates fd=new FindDuplicates();
		try{
			if(fd.containsDuplicate(nums)){
				System.out.println("Have duplicates");
			}else{
				System.out.println("No dupilcates");
			}
		}catch(InputException ie){
			System.out.println("Wrong input");
		}
	}
	

}
