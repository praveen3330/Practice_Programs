
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

	public class FileReader_Ex1 {

		public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("PwSkill.text");
		int i = fr.read();
       
        while(i!=-1) {
	        System.out.println((char)i);
            i=fr.read();
        }
    }

}
