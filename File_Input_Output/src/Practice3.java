import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice3 {

	public static void main(String[] args) throws IOException {
		// Write a program to remove duplicates from the file
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HARISH\\eclipse-workspace\\File_Input_Output\\src\\input.txt"));
		PrintWriter pw = new PrintWriter("output.txt");
		String target = br.readLine();
		while (target!=null)
		{
		boolean isAvailable =false;
		BufferedReader br1 =new BufferedReader(new 
		FileReader("output.txt"));
		String line = br1.readLine();
		//control comes out of while looop in smooth fashion without break;
		while (line!=null)
		{
		//if matched control should come out with break
		if (line.equals(target))
		{
		isAvailable = true;
		break;
		}
		line=br1.readLine();
		}
		if (isAvailable==false){
		pw.println(target);
		pw.flush();
		}
		target = br.readLine();
		}
		br.close();
		pw.close();
		
		System.out.println("Finished");
	}

}
