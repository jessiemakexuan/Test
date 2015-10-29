package addTarget;

import java.util.HashSet;

//when input is wrong throw exception
class InputException extends Exception{
	
}

//find if array's two number can add up to target
public class AddTarget {
	public boolean twoSum(int[]nums,int target)throws InputException{
		//the array should have at least 2 numbers
		if(nums.length<=1 ){
			InputException ie=new InputException();
			throw ie;
		}
		//make a HashSet named numHash
		HashSet<Integer> numHash=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			if(numHash.contains(target-nums[i])){ //find number
				return true;
			}
			numHash.add(nums[i]);//prevent add itself
		}
		return false;
	}
	public static void main(String[] args) throws Exception{
		int[] nums= new int[]{2,4,3,4};
		int target=8;
		AddTarget at=new AddTarget();
		try{
			if(at.twoSum(nums, target)){
				System.out.println("have");
			}else{
				System.out.println("don't have");
			}
		}catch(InputException ie){
			System.out.println("Wrong input");
		}
	}
}
