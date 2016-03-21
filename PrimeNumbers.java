//This program has been written to find the prime numbers between 1 and 100.
public class PrimeNumbers {

	public static void main(String[] args) {
		
		int i = 0;						// Declaration and initialization of variables.
		int j = 0;
		int iFlag =0;
		String sPrimeNumbers = "";
		
		for(i=0;i<=100;i++)				// For loop to check the range from 1 to 100.
		{
		
			iFlag=0;					// Counter to check how many time a number is divisible. 
			for(j=i;j>=1;j--)			// This for loop is to execute the division.
			{
				if(i%j == 0)			// This condition is to find the divisibility.
				{
					iFlag = iFlag + 1;	// Flag incremented.
				
				}
				
			}	
				
			if (i==1)					//	This condition is to check the number 1.
			{
				sPrimeNumbers = sPrimeNumbers + i + " ";	// This is to concat all the numbers to a string.
			}
			
			if (iFlag == 2)				// This condition is to check the flag count for other numbers excluding 1.
			{
					
				sPrimeNumbers = sPrimeNumbers + i + " ";			// This is to concat all the numbers to a string.
					
			}
		
			
		}
			
	
		System.out.println(sPrimeNumbers);		// This is to print all the prime number added to the variable sPrimeNumbers.
	
	}
	
}
