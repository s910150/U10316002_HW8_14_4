//U10316002
//林鈺閔
//HW8 14.4


public class Loan {
	
  //variables
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;

  /** Default constructor */
  public Loan() {
	  
    this(2.5, 1, 1000);
    
  }

  /** Construct a loan with specified annual interest rate,number of years and loan amount  */
  public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
	  
   setAnnualInterestRate(annualInterestRate);
   setNumberOfYears(numberOfYears);
   setLoanAmount(loanAmount);
    loanDate = new java.util.Date();
    
  }

  /** Return annualInterestRate */
  public double getAnnualInterestRate() {
	  
    return annualInterestRate;
    
  }

  /** Set a new annualInterestRate */
  public void setAnnualInterestRate(double annualInterestRate)
		  throws IllegalArgumentException{
  	
	//determine annual interest rate is bigger than 0 
  	if(annualInterestRate >=0)
  		this.annualInterestRate = annualInterestRate;
  	else //promote user which is in exception
  		throw new IllegalArgumentException("Annual interest rate can't be negative");
    
  }

  /** Return numberOfYears */
  public int getNumberOfYears() {
	  
    return numberOfYears;
    
  }
  
  /** Set a new numberOfYears */
  public void setNumberOfYears(int numberOfYears)  
		  throws IllegalArgumentException{
	//determine number of year is bigger than 0 
	  	if(numberOfYears >=0)
	  		this.numberOfYears = numberOfYears;
	  	else 
	  	//promote user which is in exception
	  		throw new IllegalArgumentException("Number of years can't be negative");
	    
    
  }

  /** Return loanAmount */
  public double getLoanAmount() {
	  
    return loanAmount;
    
  }

  /** Set a newloanAmount */
  public void setLoanAmount(double loanAmount) 
	  
    throws IllegalArgumentException{
	//determine loan amount is bigger than 0 
    	if(loanAmount >=0)
    		this.loanAmount = loanAmount;
    	else 
    		//promote user which is in exception
    		throw new IllegalArgumentException("Loan amount can't be negative");
    	
    	
    	
    	
    }
    
    


  /** Find monthly payment */
  public double getMonthlyPayment() {
	  
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
    return monthlyPayment;    
    
  }

  /** Find total payment */
  public double getTotalPayment() {
	  
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;  
    
  }

  /** Return loan date */
  public java.util.Date getLoanDate() {
	  
    return loanDate;
    
  }
}
