package movezeros;

class InputException extends Exception{
	
}

//move zeros to the end of the array
public class MoveZeros {
	public void moveZeros(int[]nums) throws InputException{
		if(nums.length==0){
			InputException ie=new InputException();
			throw ie;
		}
		
		int pointer=-1; //aim to point zero
		int number=0; //temporary number, aim to exchange
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0){
				number=nums[i];
				nums[i]=nums[++pointer];
				nums[pointer]=number;
			}
		}
		
	}
	public static void main(String[] args) throws Exception{
		int nums[]=new int[]{1,0,2};
		MoveZeros mz=new MoveZeros();
		try{
			mz.moveZeros(nums);
		}catch(InputException ie){
			System.out.println("Wrong input");
		}
	}

}
