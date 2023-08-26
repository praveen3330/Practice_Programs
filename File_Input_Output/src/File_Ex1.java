import java.io.File;
import java.io.IOException;

public class File_Ex1 {

	public static void main(String[] args) throws IOException {

	// creating a file

		File f = new File("abc.text");   // here f points out the abc file if it exist but not create
		System.out.println(f.exists());    //it checks the f is pointing the file or not
		
		f.createNewFile();             //it creates the file points  by f
		System.out.println(f.exists());    //it checks the f is pointing the file or not

	}

}