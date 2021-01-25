package akanksha.labassignment4;
import java.io.*;
public class ImageCopyBufferedStream { 
   public static void main(String[] args) {
		String inFileStr = "C:\\Users\\ve00ym238\\Desktop\\javal_lab_assignments\\ymsli_core_java\\src\\Akanksha\\labassignment4\\Subhas_Chandra_Bose_NRB.jpg";
		String outFileStr = "Subhas_Chandra_Bose_NRB_Demo.jpg";
      BufferedInputStream in = null;
      BufferedOutputStream out = null;

      try
      {
	         in  = new BufferedInputStream(new FileInputStream(inFileStr));
	         out = new BufferedOutputStream(new FileOutputStream(outFileStr));
	         int byteRead;
	         while ((byteRead = in.read()) != -1) 
	         { 
	            out.write(byteRead);
	            System.out.println("in while");
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
