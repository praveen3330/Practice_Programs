import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Ex1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("PwSkill.text",true);    //here it creates the file directly no need to write the fw.fileCreate()
		
		//FileWriter fw = new FileWriter("PwSkill.text",true);  if we dont want to erase the data which is already in the file just we have to append the data
		                               //with existing file we use true
		
		fw.write(5);
		fw.write("neuron\nTechnology\nPrivate\nLimited");
		fw.write("\n");
		char ch[] ={'a','b','c'};
		fw.write(ch);
		fw.flush();
		fw.close();
	}
}