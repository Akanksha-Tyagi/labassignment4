package akanksha.labassignment4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputMismatchExceptionDemo {
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
//we can do this also using switchcase.
