package Akanksha.labassignment4;

import java.util.InputMismatchException;
import java.util.Scanner;
class InputException extends Exception 
{ 
    public InputException(String msg) 
    { 
        super(msg); 
    } 
} 
public class Q5UserException {
	public static void main(String[] args) {
		boolean flag=true;
		int number=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			try
			{
				System.out.println("“Please enter a number or enter ‘-1’ if you want to quit” : ");
				number=sc.nextInt();
				try
				{
						if(number>100)
							throw new InputException("“Number can’t be greater than 100”."); 
						else {
								if(number==-1)
								{
									flag=false;
									continue;
								}
								if(number%2==0)
									System.out.println("“You must enter an even integer. ”");
								else
									System.out.println("“You have entered an odd number. ”");
									
								}
				}
				catch (InputException ex) 
		        { 
		            System.out.println(ex.getMessage()); 
		        } 
			
			}
			catch(InputMismatchException e)
			{
				System.out.println("“You must enter an integer.”");
			}
			
			sc.nextLine();
		}while(flag);
		System.out.println("Thanks for coming.");
		
		sc.close();
	}
}

