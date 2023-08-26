import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_Ex1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\HARISH\\eclipse-workspace\\File_Input_Output\\sachin.txt.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
        while(line!=null) {
        	System.out.println(line);
        	line = br.readLine();
        }
	}

}
