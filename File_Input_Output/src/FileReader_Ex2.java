import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Ex2 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\HARISH\\eclipse-workspace\\File_Input_Output\\sachin.txt.txt");
		FileReader fr = new FileReader(f);
        char[] ch = new char[(int)f.length()];
        fr.read(ch);
        for(char data:ch) {
        	System.out.println(data);
        }
        fr.close();
	}

}
