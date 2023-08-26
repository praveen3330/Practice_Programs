import java.io.File;

public class File_Ex5 {

	public static void main(String[] args) {
		int dirCount = 0;
		int jpgFileCount = 0;
		int txtFileCount = 0;
		int zipFileCount = 0;
		
		
		File f6 = new File("C:\\");
		String[] names = f6.list();
		
		for(String name:names) {
		   File f7 = new File(f6,name);
		
		   if(f7.isDirectory()) {
		      dirCount++;
		   }
		   else if(f7.isFile()) {
		      if(name.endsWith(".png")) {
		         jpgFileCount++;
		   }
		      if(name.endsWith(".txt")) {
		         txtFileCount++;
		   }
		      if(name.endsWith(".zip")) {
		         zipFileCount++;
		   }
		}
		System.out.println(name);
	}
		System.out.println("Total no of JPGfiles is :: "+jpgFileCount);
		System.out.println("Total no of txtfiles is :: "+txtFileCount);
		System.out.println("Total no of Zipfiles is :: "+zipFileCount);
		System.out.println("Total no of Directory is :: "+dirCount);
	}

}
