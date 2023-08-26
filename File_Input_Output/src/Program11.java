import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Program11 {

	public static void main(String[] args) throws IOException {
		//file1.txt ,file2.txt copy all the contents to file3.txt

		PrintWriter pw = new PrintWriter("file3.txt");
		//reading from first file and writing to file3.txt
		BufferedReader br= new BufferedReader(new FileReader("file1.txt"));
		String line = br.readLine();
		while (line!=null)
		{
		pw.println(line);
		line=br.readLine();
		}
		//reading from second file and writing to file3.txt
		br =new BufferedReader(new FileReader("file2.txt"));
		line = br.readLine();
		while (line!=null)
		{
		pw.println(line);
		line=br.readLine();
		}
		//To write all the data to file3.txt
		pw.flush();
		br.close();
		pw.close();
		System.out.println("Open file3.txt to see the result");

	}

}
