import java.io.File;
import java.io.IOException;

public class File_Ex3 {

	public static void main(String[] args) throws IOException {

	//creating a file inside the directory
	
	  File f2 = new File("ineuron");  //pointting the f2 to ineuron directory
	  f2.mkdir();                     //creating the directory
	  System.out.println(f2.isDirectory());   //checking f2 is directory or not
	   
	   File f3 = new File(f2,"abc.text");   //pointing f3 to the file inside the directory
	   f3.createNewFile();                 // creating a file
	   System.out.println(f3.isFile());      //checking f3 is file or not
	}

}
