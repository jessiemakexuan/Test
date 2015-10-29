package fizzbuzz;

class NumberException extends Exception {

}

//find if n can be divided by 3 or 5 or 15
public class FizzBuzz {
	public void printFizzBuzz(int n) throws NumberException{
		if(n%3==0 & n%5==0){
			System.out.println("fizz buzz");
			return;
		}
		if(n%3==0){
			System.out.println("fizz");
		}else if(n%5==0){
			System.out.println("buzz");
		}else{
			NumberException ne = new NumberException();
			throw ne;
		}
	}

	public static void main(String[] args) throws Exception{
		int n=15;
		FizzBuzz fb=new FizzBuzz();
		try{
			fb.printFizzBuzz(n);
		}catch(NumberException ne){
			System.out.println("The number is cannot be divided by either 3 or 5");
		}

	}
}
