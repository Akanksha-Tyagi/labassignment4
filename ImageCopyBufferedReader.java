package akanksha.labassignment4;
import java.io.*;
public class ImageCopyBufferedReader {
 
	//file copy
	public static void main(String[] args) throws IOException{
		String inFileStr = "C:\\Users\\ve00ym238\\Desktop\\javal_lab_assignments\\ymsli_core_java\\src\\Akanksha\\labassignment4\\yamahalogo.png";
		String outFileStr = "yamahalogo.png";
	      BufferedReader in = null;
	      BufferedWriter out = null;

	      try
	      {
		         in  = new BufferedReader(new FileReader(inFileStr));
		         out = new BufferedWriter(new FileWriter(outFileStr));
		         int byteRead;
		         while ((byteRead = in.read()) != -1) 
		         { 
		            out.write(byteRead);
		            
		         }
		         
	      }
	      catch(FileNotFoundException ex)
	      {
	    	  ex.getMessage();
	      }
	      catch (IOException ex) 
	      {
	    	  ex.getMessage();
	      } 
	      finally {           
	         try {
	            if (in != null) in.close();
	            if (out != null) out.close();
	         } 
	         catch (IOException ex) { ex.printStackTrace(); }
	      }
	      System.out.println("Done.");
				
	}

}
