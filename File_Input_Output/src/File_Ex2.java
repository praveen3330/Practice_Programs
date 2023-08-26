import java.io.File;

public class File_Ex2 {

	public static void main(String[] args) {

		// creating a directory
		
		
		File f1 = new File("IPL TEAMS");
		System.out.println(f1.exists());


	   f1.mkdir();    //Creates a new directory
	   System.out.println(f1.exists());

	}

}
