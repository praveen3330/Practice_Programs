import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice5 {

	public static void main(String[] args) throws IOException {
		// Write a code to read the data from the file and identify which data is of larger in length(assuming the data is String)

		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		String data = br.readLine();
		int maxLength = 0;
		String result = "";
		while (data!=null)
		{
		int resultLength=data.length();
		if (maxLength<resultLength)
		{
		maxLength = resultLength;
		result=data;
		}
		data= br.readLine();
		}
		System.out.println("The maxLength string data in a file is :: "+result);
		System.out.println("The maxLength string in a file is :: "+maxLength);
	}

}
