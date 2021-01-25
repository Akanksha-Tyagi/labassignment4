package akanksha.labassignment4;
import java.io.IOException;

import Akanksha.labassignment4.InputException;

class throwException
{
 throwException()
 {
	 
 }
 void throwException() throws InputException, IOException
 {
	 System.out.println("In throwException Method");
	 throw new IOException("IOException Occurs");
 }
}


public class ThrowExceptionDemo 
{
	public static void main(String[] args)
	{
		throwException ob=new throwException();
		try {
			ob.throwException();
			throw new InputException("InputException Occurs");
		} catch (InputException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
					}
	}
}

/*Ans:
1.At method it is showing warning : This method has a constructor name.
2.At main when we call throwException method it is showing surround with multi catch
*/
