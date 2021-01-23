package Akanksha.labassignment4;
import java.util.InputMismatchException;
import java.util.Scanner;
class MyInputException extends Exception 
{ 
    public MyInputException(int number) 
    { 
        super("Number can't be greater than "+ number+"."); 
    } 
} 
public class InputExceptionDemo {
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
							throw new MyInputException(number); 
						else {
								if(number==-1)
								{
									flag=false;
									continue;
								}
								if(number%2==0)
									System.out.println("“You have entered an even integer. ”");
								else
									System.out.println("“You have entered an odd number. ”");
									
								}
				}
				catch (MyInputException ex) 
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

