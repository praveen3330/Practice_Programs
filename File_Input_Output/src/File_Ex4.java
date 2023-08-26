import java.io.File;
import java.io.IOException;

public class File_Ex4 {

	public static void main(String[] args) throws IOException {
		//creating the directory in our location(wherever we want)
		
		String Location = "D:\\PwSkills";     //creating a directory in D drive
		File f4 = new File(Location);
        f4.mkdir();
       
        File f5 = new File(f4,"java.txt");
        f5.createNewFile();  //it creates the txt file in pw skills directory
        
        System.out.println("Please open D drive to check pw skills folder ");
	}

}