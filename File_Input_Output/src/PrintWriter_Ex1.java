import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter_Ex1 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.write(100);//100 unicode value will be written to a file
	    pw.write('\n');
		pw.println(100);//100 only will be written to the file
		pw.println(true);
		pw.println('c');
	    pw.println("DenisRitchie");
		pw.flush();
		pw.close();
	}

}
