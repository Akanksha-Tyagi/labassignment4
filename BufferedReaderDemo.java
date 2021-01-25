
package akanksha.labassignment4;

import java.io.*;  
public class BufferedReaderDemo{   
	
	 public static void main(String args[])
	 {    
		  try
		  { 
			  BufferedReader brreader = new BufferedReader(new InputStreamReader(System.in));
			  BufferedWriter brwriter = new BufferedWriter(new FileWriter(new File("StudentDetails")));
			  System.out.println("Enter the data you want to add in file: ");
		  String line = "";
		  String finaldata="";
	        while ((line = brreader.readLine()) != null && !line.equals("exit"))
	           finaldata += line ; //edited
	        brwriter.write(finaldata);
	        brreader.close();  
	        brwriter.close();
		  }
		  catch(FileNotFoundException e)
		  {
			  System.out.println(e.getMessage());
		  }    
		  catch(IOException e)
		  {
			  System.out.println(e.getMessage());
		  } 
    }    
}  
