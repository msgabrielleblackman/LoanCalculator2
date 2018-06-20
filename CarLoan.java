public class CarLoan {
	public static void main(String[] args) {

	int carLoan = 10000;
  int loanLength = 3;
  int interestRate = 5;
  int downPayment = 2000;
    
    if(loanLength <= 0 || interestRate <= 0){
      
      System.out.println("Error! You must take out a valid car loan.");
      
    }else if (downPayment >= carLoan){
      
      System.out.println("The car can be paid in full.");
    }else{
     
      int remainingBalance = carLoan - downPayment;
      //This below converts the loan from years to months
      int months = loanLength * 12;
      //This below represents the monthly payment without interest included
      int monthlyBalance = remainingBalance / months;
      //The user needs to pay interest on the loan borrowed
      int interest = (monthlyBalance * interestRate) / 100;
      
      //Calculate Final Monthly Payment
      int monthlyPayment = monthlyBalance + interest;
      
     System.out.println(monthlyPayment);
      
      
    }
  
  

	}
}