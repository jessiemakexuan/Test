package anagram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FindAnagramTest {

	@Test
	public void test() throws InputException {
		FindAnagram fa=new FindAnagram();
		String s="anan";
		String t="nana";
		assertTrue(fa.isAnagram(s, t));
		
		String s1="anan";
		String t1="nanb";
		assertFalse(fa.isAnagram(s1, t1));
		
		
		String sE1="";
		String tE1="nanb";
		try{
			if(fa.isAnagram(sE1, tE1)){
				System.out.println("t is an anagram of s");
			}else{
				System.out.println("t is NOT an anagram of s");
			}
		}catch(InputException ie){
			System.out.println("Wrong input");
		}
		
		String sE2="an";
		String tE2="nana";
		try{
			if(fa.isAnagram(sE2, tE2)){
				System.out.println("t is an anagram of s");
			}else{
				System.out.println("t is NOT an anagram of s");
			}
		}catch(InputException ie){
			System.out.println("Wrong input");
		}
	}

}
