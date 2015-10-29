package duplicates;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FindDuplicatesTest {

	@Test
	public void test() throws InputException {
		FindDuplicates fd=new FindDuplicates();
		int[]nums1=new int[]{1,2,2,1,2};
		assertTrue(fd.containsDuplicate(nums1));
		
		int[]nums2=new int[]{1,2};
		assertFalse(fd.containsDuplicate(nums2));
		
		int[]numsE1=new int[]{11};
		try{
			if(fd.containsDuplicate(numsE1)){
				System.out.println("No duplicates");
			}else{
				System.out.println("have dupilcates");
			}
		}catch(InputException ie){
			System.out.println("Wrong input");
		}
		
		int[]numsE2=new int[]{};
		try{
			if(fd.containsDuplicate(numsE2)){
				System.out.println("No duplicates");
			}else{
				System.out.println("have dupilcates");
			}
		}catch(InputException ie){
			System.out.println("Wrong input");
		}
	}

}
