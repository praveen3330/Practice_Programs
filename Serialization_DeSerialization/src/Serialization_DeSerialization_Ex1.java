import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/*
public java.io.ObjectOutputStream(java.io.OutputStream) throws 
java.io.IOException;
public java.io.FileOutputStream(java.lang.String) throws 
java.io.FileNotFoundException;
public final void writeObject(java.lang.Object) throws java.io.IOException;
public java.io.ObjectInputStream(java.io.InputStream) throws java.io.IOException;
public java.io.FileInputStream(java.lang.String) throws 
java.io.FileNotFoundException;
public final java.lang.Object readObject() throws java.io.IOException, 
java.lang.ClassNotFoundException;
*/


class Dog implements Serializable{
	static {
		System.out.println("Static block is called");
	}
	Dog(){
		System.out.println("Object is called");
	}
	int i = 10;
	int j = 20;
}
public class Serialization_DeSerialization_Ex1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d = new Dog();
		System.out.println("Serialization started.....");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialized Object refernce is ::"+d);
		System.out.println("Serialization ended.....");
		
		//To pause the execution till we press some key from keyboard
		System.in.read();
		
		System.out.println("De-Serialization started.....");
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj=ois.readObject();
		Dog d1 = (Dog)obj;
		System.out.println("De-Serialized Object refernce is ::"+d1);
		System.out.println("De-Serialization ended.....");
	}

}
