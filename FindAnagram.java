package anagram;

import java.util.Arrays;

class InputException extends Exception{
	
}

//find anagram word
public class FindAnagram {
	public boolean isAnagram(String s, String t ) throws InputException{
		if(s.length()!=t.length() | s.equals(null)| t.equals(null)){
			InputException ie=new InputException();
			throw ie;
		}
		
		char sArray[]=s.toCharArray();
		char tArray[]=t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		String sNew=String.valueOf(sArray);
		String tNew=String.valueOf(tArray);
		if(sNew.equals(tNew)){
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) throws Exception{
		String s="anan";
		String t="nanb";
		FindAnagram fa=new FindAnagram();
		try{
			if(fa.isAnagram(s, t)){
				System.out.println("t is an anagram of s");
			}else{
				System.out.println("t is NOT an anagram of s");
			}
		}catch(InputException ie){
			System.out.println("Wrong input");
		}
		

	}

}
