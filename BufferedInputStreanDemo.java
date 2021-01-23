package Akanksha.labassignment4;

import java.io.*;  
public class BufferedInputStreanDemo{   
	
	 public static void main(String args[])
	 {    
		  try{    
			    FileInputStream fin=new FileInputStream("C:\\Users\\ve00ym238\\Desktop\\javal_lab_assignments\\ymsli_core_java\\src\\Akanksha\\labassignment4\\NetajiSubhasBose.txt");    
			    BufferedInputStream bin=new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1)
			    {    System.out.print(i);
			     System.out.print((char)i);    
			    }		    
		    bin.close();    
		    fin.close();    
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