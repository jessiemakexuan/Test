package addTarget;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AddTargetTest {

	@Test
	public void test() throws InputException {
		AddTarget at=new AddTarget();
		int[] nums= new int[]{2,2,3,1};
		int target=4;
		assertTrue(at.twoSum(nums, target));
		
		int[]nums1=new int[]{2,3};
		int target1=5;
		assertTrue(at.twoSum(nums1, target1));
		
		int[]nums2=new int[]{1,3,4};
		int target2=8;
		assertFalse(at.twoSum(nums2, target2));
		
		int[]nums3=new int[]{2,3,4,4,4};
		int target3=8;
		assertTrue(at.twoSum(nums3, target3));
		
		int[]nums4=new int[]{2,2};
		int target4=4;
		assertTrue(at.twoSum(nums4, target4));
		
		int[]numsE=new int[]{2};
		int targetE=4;
		try{
			if(at.twoSum(numsE, targetE)){
				System.out.println("have");
			}else{
				System.out.println("don't have");
			}
		}catch(InputException ie){
			System.out.println("Wrong input");
		}
		
	}

}
