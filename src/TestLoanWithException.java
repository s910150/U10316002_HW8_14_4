
public class TestLoanWithException {

	public static void main(String[]args){
		
		try{
			
			Loan loan1 = new Loan(2.5, 1, -1000);
			
		
		}
		
		catch(IllegalArgumentException ex){
			
			System.out.println(ex);
	
		}
		try{
		
			Loan loan2 = new Loan(-2.5, 1, 1000);
		
		}
		
		catch(IllegalArgumentException ex){
			
			System.out.println(ex);
	
		}
		try{
		
			Loan loan3 = new Loan(2.5, -1, 1000);
		
		}
		
		catch(IllegalArgumentException ex){
			
			System.out.println(ex);
	
		}
		
		
	}
	
}
