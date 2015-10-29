package fizzbuzz;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() throws NumberException {
		FizzBuzz fb=new FizzBuzz();
		int n1=45;
		fb.printFizzBuzz(n1);
		
		int n2=9;
		fb.printFizzBuzz(n2);
		
		int n3=55;
		fb.printFizzBuzz(n3);
		
		int nE=1;
		try{
			fb.printFizzBuzz(nE);
		}catch(NumberException ne){
			System.out.println("The number is cannot be divided by either 3 or 5");
		}
	}

}
