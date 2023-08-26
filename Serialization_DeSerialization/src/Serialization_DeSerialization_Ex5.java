import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Dog5 implements Serializable{
	 int i=10;
	 transient final int j=20;
}
public class Serialization_DeSerialization_Ex5 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog5 d1=new Dog5();
		
		System.out.println("serialization started");
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
		System.out.println("Deserialization started");
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog5 d2=(Dog5) ois.readObject();
		System.out.println("Deserialization ended");
		System.out.println("Dog object data");
		System.out.println(d2.i+"\t" +d2.j);

	}

}
