
public class TestLoanWithException {

	public static void main(String[]args){
		
		
		//try if variables <=0
		try{
			
			Loan loan1 = new Loan(2.5, 1, -1000);
			
		}
		
		catch(IllegalArgumentException ex){
			
			System.out.println(ex);
	
		}
		//try if variables <=0
		try{
		
			Loan loan2 = new Loan(-2.5, 1, 1000);
		
		}
		
		catch(IllegalArgumentException ex){
			
			System.out.println(ex);
	
		}
		//try if variables <=0
		try{
		
			Loan loan3 = new Loan(2.5, -1, 1000);
		
		}
		
		catch(IllegalArgumentException ex){
			
			System.out.println(ex);
	
		}
		
		
	}
	
}
