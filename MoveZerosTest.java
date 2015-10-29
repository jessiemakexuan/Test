package movezeros;

import org.junit.Assert;
import org.junit.Test;


public class MoveZerosTest {

	@Test
	public void test() throws InputException {
		MoveZeros mz=new MoveZeros();
		int nums1[]={0,1,0,3,0,2};
		mz.moveZeros(nums1);
		int expecteds1[]={1,3,2,0,0,0};
		Assert.assertArrayEquals(expecteds1, nums1);
		
		int nums2[]={0,0,3,0,2};
		mz.moveZeros(nums2);
		int expecteds2[]={3,2,0,0,0};
		Assert.assertArrayEquals(expecteds2, nums2);
		
		int nums3[]={0,0,3,0,0};
		mz.moveZeros(nums3);
		int expecteds3[]={3,0,0,0,0};
		Assert.assertArrayEquals(expecteds3, nums3);
		
		int numsE[]=new int[]{};
		try{
			mz.moveZeros(numsE);
		}catch(InputException ie){
			System.out.println("Wrong input");
		}

	}

}
