import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice2 {
	
	//Requirement => file1.txt file2.txt copy one line from file1.txt and from file2.txt to file3.txt

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("file3.txt");
		//reading from first file and writing to file3.txt
		BufferedReader br1= new BufferedReader(new FileReader("C:\\Users\\HARISH\\Downloads\\File_Input_Output.zip\\File_Input_Output\\file1.txt"));
		String line1 = br1.readLine();
		BufferedReader br2 =new BufferedReader(new FileReader("C:\\Users\\HARISH\\Downloads\\File_Input_Output.zip\\File_Input_Output\\file2.txt"));
		String line2 = br2.readLine();
		while (line1!=null || line2!=null)
		{
		if (line1!=null)
		{
		pw.println(line1);
		line1=br1.readLine();
		}
		if(line2!=null)
		{
		pw.println(line2);
		line2=br2.readLine();
		}
		}
		//To write all the data to file3.txt
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
		System.out.println("Open file3.txt to see the result ");

	}

}
